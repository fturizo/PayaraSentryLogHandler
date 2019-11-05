package fish.payara.sentry;

import io.sentry.jul.SentryHandler;
import java.util.logging.Handler;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Singleton;
import org.jvnet.hk2.annotations.ContractsProvided;

@Service
@Singleton
@ContractsProvided({PayaraSentryHandler.class, Handler.class})
public class PayaraSentryHandler extends SentryHandler {
}