            package io.flutter.plugins.sharedpreferences;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            import p000.kb1;
            import p000.ke0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m6176d2 = {"Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;", HttpUrl.FRAGMENT_ENCODE_SET, "raw", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "(Ljava/lang/String;II)V", "getRaw", "()I", "PLATFORM_ENCODED", "JSON_ENCODED", "UNEXPECTED_STRING", "Companion", "shared_preferences_android_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 2 */     public enum StringListLookupResultType {
                PLATFORM_ENCODED(0),
                JSON_ENCODED(1),
                UNEXPECTED_STRING(2);

                private final int raw;
                private static final /* synthetic */ ke0 $ENTRIES = kb1.m6030C(values());

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                StringListLookupResultType(int i) {
/* 4 */             this.raw = i;
                }

                public static ke0 getEntries() {
/* 1 */             return $ENTRIES;
                }

                public final int getRaw() {
/* 1 */             return this.raw;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m6176d2 = {"Lio/flutter/plugins/sharedpreferences/StringListLookupResultType$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "ofRaw", "Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;", "raw", HttpUrl.FRAGMENT_ENCODE_SET, "shared_preferences_android_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final StringListLookupResultType ofRaw(int raw) {
/* 7 */                 for (StringListLookupResultType stringListLookupResultType : StringListLookupResultType.values()) {
/* 15 */                    if (stringListLookupResultType.getRaw() == raw) {
/* 17 */                        return stringListLookupResultType;
                            }
                        }
/* 21 */                return null;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
