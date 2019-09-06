package emerge.project.caloriecaffeadmin.network.firebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lemerge/project/caloriecaffeadmin/network/firebase/FirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "onMessageReceived", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "sendNotification", "messageBody", "messageTitle", "app_release"})
public final class FirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "FB";
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.Nullable()
    com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    private final void sendNotification(java.lang.String messageBody, java.lang.String messageTitle) {
    }
    
    public FirebaseMessagingService() {
        super();
    }
}