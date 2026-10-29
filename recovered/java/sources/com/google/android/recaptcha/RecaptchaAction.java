            package com.google.android.recaptcha;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m6176d2 = {"Lcom/google/android/recaptcha/RecaptchaAction;", HttpUrl.FRAGMENT_ENCODE_SET, "action", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "(Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "Companion", "java.com.google.android.libraries.abuse.recaptcha.enterprise.public_public"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 2 */     public final /* data */ class RecaptchaAction {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final RecaptchaAction LOGIN = new RecaptchaAction(FirebaseAnalytics.Event.LOGIN);
                public static final RecaptchaAction SIGNUP = new RecaptchaAction("signup");
                private final String action;

                private RecaptchaAction(String str) {
/* 4 */             this.action = str;
                }

                public static /* synthetic */ RecaptchaAction copy$default(RecaptchaAction recaptchaAction, String str, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = recaptchaAction.action;
                    }
/* 7 */             return recaptchaAction.copy(str);
                }

                public static final RecaptchaAction custom(String str) {
/* 3 */             return INSTANCE.custom(str);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getAction() {
/* 1 */             return this.action;
                }

                public final RecaptchaAction copy(String action) {
/* 3 */             return new RecaptchaAction(action);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
                    return (other instanceof RecaptchaAction) && Intrinsics.m6216a(this.action, ((RecaptchaAction) other).action);
                }

                public final String getAction() {
/* 1 */             return this.action;
                }

                public int hashCode() {
/* 3 */             return this.action.hashCode();
                }

                public String toString() {
/* 12 */            return fm0.m3789o(new StringBuilder("RecaptchaAction(action="), this.action, ")");
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m6176d2 = {"Lcom/google/android/recaptcha/RecaptchaAction$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "LOGIN", "Lcom/google/android/recaptcha/RecaptchaAction;", "SIGNUP", "custom", "customAction", HttpUrl.FRAGMENT_ENCODE_SET, "java.com.google.android.libraries.abuse.recaptcha.enterprise.public_public"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    private Companion() {
                    }

                    public final RecaptchaAction custom(String customAction) {
/* 4 */                 return new RecaptchaAction(customAction, null);
                    }

/* 4 */             public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 5 */                 this();
                    }
                }

/* 6 */         public /* synthetic */ RecaptchaAction(String str, DefaultConstructorMarker defaultConstructorMarker) {
/* 7 */             this(str);
                }
            }
