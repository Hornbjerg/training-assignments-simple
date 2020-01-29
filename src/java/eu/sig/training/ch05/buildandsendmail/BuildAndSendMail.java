package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    // tag::buildAndSendMail[]
    public void buildAndSendMail(MailMan m, ReceiverInfo recInfo, MailInfo mailInfo) {
        // Format the email address
        String mId = recInfo.getFirstName().charAt(0) + "." + recInfo.getLastName().substring(0, 7) + "@"
            + recInfo.getDivision().substring(0, 5) + ".compa.ny";
        // Format the message given the content type and raw message
        MailMessage mMessage = formatMessage(mailInfo.getFont(), mailInfo.getConcatedMessages());
        // Send message
        m.send(mId, mailInfo.getSubject(), mMessage);
    }
    // end::buildAndSendMail[]

    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

    private class MailMan {

        public void send(String mId, String subject, MailMessage mMessage) {}

    }

    public class MailFont {

    }

    private class MailMessage {

    }

}