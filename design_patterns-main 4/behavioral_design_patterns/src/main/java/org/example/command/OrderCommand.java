
package org.example.command;

import org.springframework.stereotype.Repository;

@Repository
public interface OrderCommand {
    void execute() ;
    void cancel();
}
