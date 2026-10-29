            package com.supercell.p007id.scid_plugin;

            import android.content.Context;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.android.core.AbstractC1245n0;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/SharedDataStorage;", HttpUrl.FRAGMENT_ENCODE_SET, "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "encryptedStorage", "Lcom/supercell/id/scid_plugin/EncryptedStorage;", "putString", HttpUrl.FRAGMENT_ENCODE_SET, "key", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.VALUE, "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;", "getString", "Companion", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 4 */     public final class SharedDataStorage {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final String PREFIX = "SCID";
                private final EncryptedStorage encryptedStorage;

                private SharedDataStorage(Context context) {
                    EncryptedStorage encryptedStorage;
                    try {
/* 8 */                 encryptedStorage = new EncryptedStorage(context, "com.supercell.id.util.SharedDataStorage");
                    } catch (Exception e) {
/* 29 */                AbstractC1245n0.m4891s("SharedDataStorage", "Failed to create encrypted storage " + e, e);
/* 32 */                encryptedStorage = null;
                    }
/* 33 */            this.encryptedStorage = encryptedStorage;
                }

                public final String getString(String key) {
/* 1 */             key.getClass();
/* 4 */             EncryptedStorage encryptedStorage = this.encryptedStorage;
/* 6 */             if (encryptedStorage != null) {
/* 8 */                 return encryptedStorage.get(key);
                    }
/* 13 */            return null;
                }

                public final Unit putString(String key, String value) {
/* 1 */             key.getClass();
/* 4 */             EncryptedStorage encryptedStorage = this.encryptedStorage;
/* 6 */             if (encryptedStorage == null) {
/* 14 */                return null;
                    }
/* 8 */             encryptedStorage.put(key, value);
/* 11 */            return Unit.f12910a;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/SharedDataStorage$Companion;", "Lcom/supercell/id/scid_plugin/SingletonHolder;", "Lcom/supercell/id/scid_plugin/SharedDataStorage;", "Landroid/content/Context;", "<init>", "()V", "PREFIX", HttpUrl.FRAGMENT_ENCODE_SET, "getKeyAccounts", "environment", "getKeySharedAccounts", "scidEnvironment", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 5 */         public static final class Companion extends SingletonHolder<SharedDataStorage, Context> {
                    private Companion() {
/* 3 */                 super(C0784c.f5702a);
                    }

                    public final String getKeyAccounts(String environment) {
/* 1 */                 environment.getClass();
/* 19 */                return "SCID_" + environment + "_accounts";
                    }

                    public final String getKeySharedAccounts(String scidEnvironment) {
/* 1 */                 scidEnvironment.getClass();
/* 19 */                return "SCID_" + scidEnvironment + "_shared_accounts";
                    }

/* 6 */             public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 7 */                 this();
                    }
                }

/* 35 */        public /* synthetic */ SharedDataStorage(Context context, DefaultConstructorMarker defaultConstructorMarker) {
/* 36 */            this(context);
                }
            }
