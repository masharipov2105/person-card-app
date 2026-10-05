package com.masharipov2105.systems.services;

import com.masharipov2105.systems.models.ResponseModel;
import com.masharipov2105.systems.models.RequestModel;

public interface CardService{

	void createCard(RequestModel model) throws Exception;
	ResponseModel readCard();
	void updateCard(RequestModel newModel) throws Exception;
	void deleteCard() throws Exception;
}