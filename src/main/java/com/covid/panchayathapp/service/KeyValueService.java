package com.covid.panchayathapp.service;

import java.util.List;

import com.covid.panchayathapp.model.KeyValueModel;

public interface KeyValueService {

	List<KeyValueModel> getAllKeyValue();

	List<KeyValueModel> getKeyValueByCategory(String category);

}
