            package com.android.installreferrer.api;

            import android.content.Context;
            import android.os.RemoteException;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class InstallReferrerClient {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class Builder {
                    private final Context mContext;

                    private Builder(Context context) {
/* 4 */                 this.mContext = context;
                    }

                    public InstallReferrerClient build() {
/* 1 */                 Context context = this.mContext;
/* 3 */                 if (context != null) {
/* 7 */                     return new C0226b(context);
                        }
/* 13 */                C1951n4.m6859j("Please provide a valid Context.");
/* 16 */                return null;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Retention(RetentionPolicy.SOURCE)
                public @interface InstallReferrerResponse {
                    public static final int DEVELOPER_ERROR = 3;
                    public static final int FEATURE_NOT_SUPPORTED = 2;

                    /* JADX INFO: renamed from: OK */
                    public static final int f3035OK = 0;
                    public static final int PERMISSION_ERROR = 4;
                    public static final int SERVICE_DISCONNECTED = -1;
                    public static final int SERVICE_UNAVAILABLE = 1;
                }

                public static Builder newBuilder(Context context) {
/* 4 */             return new Builder(context);
                }

                public abstract void endConnection();

                public abstract ReferrerDetails getInstallReferrer() throws RemoteException;

                public abstract boolean isReady();

                public abstract void startConnection(InstallReferrerStateListener installReferrerStateListener);
            }
