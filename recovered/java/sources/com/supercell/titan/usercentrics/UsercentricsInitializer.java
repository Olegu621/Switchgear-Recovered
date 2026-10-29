            package com.supercell.titan.usercentrics;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import com.usercentrics.sdk.UsercentricsOptions;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.List;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.C1908lz;
            import p000.e03;
            import p000.nd0;
            import p000.wx0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m6176d2 = {"Lcom/supercell/titan/usercentrics/UsercentricsInitializer;", "Lwx0;", "Lcom/supercell/titan/usercentrics/UsercentricsSDK;", "<init>", "()V", "Landroid/content/Context;", "context", HttpUrl.FRAGMENT_ENCODE_SET, "key", "getMetaData", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "create", "(Landroid/content/Context;)Lcom/supercell/titan/usercentrics/UsercentricsSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "Companion", "usercentrics"}, m6177k = 1, m6178mv = {2, 2, 0}, m6180xi = 48)
            public final class UsercentricsInitializer implements wx0 {
                private static final String TAG = "UsercentricsInitializer";

                /* JADX INFO: Access modifiers changed from: private */
                public static final void create$lambda$1(Context context, UsercentricsOptions usercentricsOptions) {
/* 1 */             context.getClass();
/* 4 */             usercentricsOptions.getClass();
/* 7 */             e03 e03Var = e03.f7466a;
/* 9 */             Context applicationContext = context.getApplicationContext();
/* 15 */            if (e03.f7468c) {
/* 28 */                e03.f7469d = new C1908lz(11, usercentricsOptions, applicationContext);
                    } else {
/* 17 */                e03.m3287c(applicationContext, usercentricsOptions);
                    }
                }

                private final String getMetaData(Context context, String key) {
                    try {
/* 17 */                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(key);
                    } catch (PackageManager.NameNotFoundException e) {
/* 43 */                AbstractC1245n0.m4876d("UsercentricsInitializer", "Error getting Usercentrics metadata: " + e.getLocalizedMessage());
/* 46 */                return null;
                    }
                }

                @Override // p000.wx0
                public UsercentricsSDK create(Context context) {
                    return new UsercentricsSDK();
                }

                @Override // p000.wx0
                public List<Class<? extends wx0>> dependencies() {
/* 1 */             return nd0.f14189a;
                }
            }
