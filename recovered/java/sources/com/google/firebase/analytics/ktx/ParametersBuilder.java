            package com.google.firebase.analytics.ktx;

            import android.os.Bundle;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\t\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000eH\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0007J#\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0007¢\u0006\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m6176d2 = {"Lcom/google/firebase/analytics/ktx/ParametersBuilder;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "param", HttpUrl.FRAGMENT_ENCODE_SET, "key", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;[Landroid/os/Bundle;)V", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 13 */    public final class ParametersBuilder {
                private final Bundle zza = new Bundle();

                /* JADX INFO: renamed from: getBundle, reason: from getter */
                public final Bundle getZza() {
/* 1 */             return this.zza;
                }

                public final void param(String key, Bundle[] value) {
/* 1 */             key.getClass();
/* 4 */             value.getClass();
/* 11 */            this.zza.putParcelableArray(key, value);
                }

/* 14 */        public final void param(String key, long value) {
                    key.getClass();
/* 15 */            this.zza.putLong(key, value);
                }

/* 15 */        public final void param(String key, Bundle value) {
                    key.getClass();
                    value.getClass();
/* 16 */            this.zza.putBundle(key, value);
                }

/* 16 */        public final void param(String key, String value) {
                    key.getClass();
                    value.getClass();
/* 17 */            this.zza.putString(key, value);
                }

/* 17 */        public final void param(String key, double value) {
                    key.getClass();
/* 18 */            this.zza.putDouble(key, value);
                }
            }
