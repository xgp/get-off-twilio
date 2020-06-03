This doesn't work yet. Ping me for instructions if I asked you to test this.

# hub

## How does this work?

Prototype assumes you're using Twilio, and that you've secured your endpoints using network protection, as there is no built-in auth, nor do we validate your Twilio creds.

Router gets a static config, which is a map of Providers to Credentials, and a map of Addresses to Providers

Everything gets a Router, which can take an MO or MT.

Provider loads from SPI
 - can be used to create a ClientApi
 - can be used to get jaxrs Resources for mo and dlr

## How do you run it?

`java -cp <classpath> com.github.xgp.Hub -c mappings.json -u https://example.com/your-callback-url`

## webhook url flow to keep it stateless

- requestor adds status_callback url to request
- convert the url to http://local.url/<provider>/dlr/<internal_id>/<source_provider>/<urlencode(base64(callback))>
- when received, convert callback to source_provider format and 

## TwiML bullshit

- incoming message comes from a non-Twilio provider
- convert to Twilio format and send to default callback url
- parse response TwiML and create message(s)
- send via same provider

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
