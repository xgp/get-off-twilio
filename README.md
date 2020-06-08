This doesn't work yet. Ping me for instructions if I asked you to test this.

# hub

## How does this work?

Prototype assumes you're using Twilio, and that you've secured your endpoints using network protection, as there is no built-in auth, nor do we validate your Twilio creds.

Router gets a static config, which is a map of Providers to Credentials, and a map of Addresses to Providers

Everything gets a Router, which can take an MO, MT or DLR.

Provider loads from SPI
 - can be used to create a ClientApi
 - can be used to get JAX-RS Resources for mo and dlr

## How do you run it?

`HUB_CONFIG=config.json mvn jetty:run`

## What methods to support

- https://www.twilio.com/docs/sms/tutorials/how-to-send-sms-messages-python
- https://www.twilio.com/docs/sms/tutorials/how-to-receive-and-reply-python
- https://www.twilio.com/docs/sms/send-messages#monitor-the-status-of-your-message

## Supported vendors

### Sinch

https://developers.sinch.com/docs/sms-guide

### OpenMarket

https://www.openmarket.com/docs/Content/apis/v4http/overview.htm

## Notes

https://registry.hub.docker.com/_/jetty/
