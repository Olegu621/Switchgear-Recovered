            package com.google.android.gms.internal.internal;

            import android.content.Context;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Looper;
            import com.google.android.gms.common.Feature;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.C2345wv;
            import p000.InterfaceC2478xy;
            import p000.kr0;
            import p000.pg3;
            import p000.wp1;
            
            /* JADX INFO: renamed from: com.google.android.gms.internal.recaptchabase.zzm, reason: from Kotlin metadata */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!¨\u0006#"}, m6176d2 = {"Lcom/google/android/gms/recaptchabase/internal/RecaptchaBaseClientImpl;", "Lkr0;", "Lcom/google/android/gms/recaptchabase/internal/IRecaptchaBaseService;", "Landroid/content/Context;", "context", "Landroid/os/Looper;", "looper", "Lwv;", "clientSettings", "Lxy;", "connectionCallbacks", "Lwp1;", "connectionFailedListener", "<init>", "(Landroid/content/Context;Landroid/os/Looper;Lwv;Lxy;Lwp1;)V", HttpUrl.FRAGMENT_ENCODE_SET, "getMinApkVersion", "()I", HttpUrl.FRAGMENT_ENCODE_SET, "getServiceDescriptor", "()Ljava/lang/String;", "getStartServiceAction", HttpUrl.FRAGMENT_ENCODE_SET, "getUseDynamicLookup", "()Z", "usesClientTelemetry", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/google/android/gms/common/Feature;", "getApiFeatures", "()[Lcom/google/android/gms/common/Feature;", "Landroid/os/IBinder;", "iBinder", "createServiceInterface", "(Landroid/os/IBinder;)Lcom/google/android/gms/recaptchabase/internal/IRecaptchaBaseService;", "Companion", "java.com.google.android.gmscore.integ.client.recaptchabase_recaptchabase_kt"}, m6177k = 1, m6178mv = {2, 0, 0}, m6180xi = 48)
            public final class RecaptchaBaseClientImpl extends kr0 {
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public RecaptchaBaseClientImpl(Context context, Looper looper, C2345wv c2345wv, InterfaceC2478xy interfaceC2478xy, wp1 wp1Var) {
/* 24 */            super(context, looper, 380, c2345wv, interfaceC2478xy, wp1Var);
/* 1 */             context.getClass();
/* 4 */             looper.getClass();
/* 7 */             c2345wv.getClass();
/* 10 */            interfaceC2478xy.getClass();
/* 13 */            wp1Var.getClass();
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
/* 1 */             iBinder.getClass();
/* 4 */             if (iBinder == null) {
/* 6 */                 return null;
                    }
/* 10 */            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                    return iInterfaceQueryLocalInterface instanceof zzf ? (zzf) iInterfaceQueryLocalInterface : new zzf(iBinder);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final Feature[] getApiFeatures() {
/* 1 */             return pg3.f15119f;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final int getMinApkVersion() {
/* 1 */             return 17895000;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getServiceDescriptor() {
/* 1 */             return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getStartServiceAction() {
/* 1 */             return "com.google.android.gms.recaptchabase.service.START";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final boolean getUseDynamicLookup() {
/* 1 */             return true;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final boolean usesClientTelemetry() {
/* 1 */             return false;
                }
            }
