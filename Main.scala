import discord4j.core.*;
import discord4j.core.event.domain.lifecycle.ReadyEvent
import discord4j.core.`object`.entity.User
import org.reactivestreams.Publisher
import scala.compiletime.ops.any

object MyBot {

  @main
  def run = 
    DiscordClient.create("OTAzMzU1ODY1NTAxOTI5NTUy.YXrxtQ.bgWfT3clJgbXGrXgC114az4sRuw").withGateway(withGateWayHandler).block();
        
    
    def withGateWayHandler(client: GatewayDiscordClient) = 
      client.on(Class<ReadyEvent>, handleReadyEvent)
    
    def handleReadyEvent(event) = 
      val user: User = event.GetSelf
  
}