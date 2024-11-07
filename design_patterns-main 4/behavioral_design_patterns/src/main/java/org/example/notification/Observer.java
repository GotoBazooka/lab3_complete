
package org.example.notification;

import org.springframework.stereotype.Repository;

@Repository
public interface Observer {
    void update(String message);
}
