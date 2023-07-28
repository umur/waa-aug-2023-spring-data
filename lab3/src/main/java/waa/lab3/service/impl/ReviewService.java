package waa.lab3.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.lab3.domain.Review;
import waa.lab3.dto.ReviewDto;
import waa.lab3.repository.IReviewRepository;
import waa.lab3.service.IReviewService;

import java.util.ArrayList;
import java.util.List;
@Service
public class ReviewService implements IReviewService {
    @Autowired
    private IReviewRepository reviewRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ReviewDto> getAll() {
        var entityList= reviewRepository.findAll();
        List<ReviewDto> dtoList = new ArrayList<>();
        entityList.forEach(entity->{
            var dto= modelMapper.map(entity,ReviewDto.class);
            dtoList.add(dto);
        });
        return dtoList;
    }

    @Override
    public ReviewDto getById(int id) {
        var entity=reviewRepository.findById(id);
        return modelMapper.map(entity,ReviewDto.class);
    }

    @Override
    public void deleteById(int id) {
        reviewRepository.deleteById(id);
    }

    @Override
    public void save(ReviewDto reviewDto) {
        var entity= modelMapper.map(reviewDto, Review.class);
        reviewRepository.save(entity);
    }

    @Override
    public void update(int id, ReviewDto reviewDto) {
        Review entity= reviewRepository.findById(id).orElse(null);
        modelMapper.map(reviewDto,entity);
        assert entity != null;
        reviewRepository.save(entity);
    }

    @Override
    public List<ReviewDto> getReviewsByProductId(int id) {
        var entityList=reviewRepository.getReviewsByProductId(id);
        List<ReviewDto> dtoList = new ArrayList<>();
        entityList.forEach(entity->{
            var dto= modelMapper.map(entity,ReviewDto.class);
            dtoList.add(dto);
        });
        return dtoList;
    }
}
