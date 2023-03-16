package ru.itis.rusteam.services;

import ru.itis.rusteam.dto.application.ApplicationDto;
import ru.itis.rusteam.dto.application.ApplicationsPage;
import ru.itis.rusteam.dto.application.NewOrUpdateApplicationDto;

public interface ApplicationsService {

    ApplicationsPage getAllApplications(int page);

    ApplicationDto getApplicationById(Long id);

    ApplicationDto addApplication(NewOrUpdateApplicationDto application);

    ApplicationDto updateApplication(Long id, NewOrUpdateApplicationDto updatedApplication);

    void deleteApplication(Long id);

    ApplicationDto publishApplication(Long id);


}
