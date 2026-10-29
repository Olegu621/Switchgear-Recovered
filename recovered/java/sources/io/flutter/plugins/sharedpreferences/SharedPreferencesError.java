            package io.flutter.plugins.sharedpreferences;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m6176d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesError;", HttpUrl.FRAGMENT_ENCODE_SET, "code", HttpUrl.FRAGMENT_ENCODE_SET, "message", "details", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getCode", "()Ljava/lang/String;", "getMessage", "getDetails", "()Ljava/lang/Object;", "shared_preferences_android_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 14 */    public final class SharedPreferencesError extends Throwable {
                private final String code;
                private final Object details;
                private final String message;

                public /* synthetic */ SharedPreferencesError(String str, String str2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 12 */            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : obj);
                }

                public final String getCode() {
/* 1 */             return this.code;
                }

                public final Object getDetails() {
/* 1 */             return this.details;
                }

                @Override // java.lang.Throwable
                public String getMessage() {
/* 1 */             return this.message;
                }

/* 15 */        public SharedPreferencesError(String str, String str2, Object obj) {
                    str.getClass();
/* 17 */            this.code = str;
/* 18 */            this.message = str2;
/* 19 */            this.details = obj;
                }
            }
