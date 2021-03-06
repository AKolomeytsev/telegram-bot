package pro.sky.telegrambot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.telegrambot.model.notification_task;

import java.util.Collection;

public interface RepositoryNotification_task extends JpaRepository<notification_task, Long> {
    Collection<notification_task> findAllBy();
}
