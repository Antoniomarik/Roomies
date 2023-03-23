package com.roomies.roomies.repository;

import com.roomies.roomies.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository <Item,Long> {
}
