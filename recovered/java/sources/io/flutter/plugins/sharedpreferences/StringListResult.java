            package io.flutter.plugins.sharedpreferences;

            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.C2085pw;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m6176d2 = {"Lio/flutter/plugins/sharedpreferences/StringListResult;", HttpUrl.FRAGMENT_ENCODE_SET, "jsonEncodedValue", HttpUrl.FRAGMENT_ENCODE_SET, "type", "Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;", "<init>", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;)V", "getJsonEncodedValue", "()Ljava/lang/String;", "getType", "()Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;", "toList", HttpUrl.FRAGMENT_ENCODE_SET, "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "Companion", "shared_preferences_android_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 2 */     public final /* data */ class StringListResult {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String jsonEncodedValue;
                private final StringListLookupResultType type;

                public StringListResult(String str, StringListLookupResultType stringListLookupResultType) {
/* 1 */             stringListLookupResultType.getClass();
/* 7 */             this.jsonEncodedValue = str;
/* 9 */             this.type = stringListLookupResultType;
                }

                public static /* synthetic */ StringListResult copy$default(StringListResult stringListResult, String str, StringListLookupResultType stringListLookupResultType, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = stringListResult.jsonEncodedValue;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                stringListLookupResultType = stringListResult.type;
                    }
/* 13 */            return stringListResult.copy(str, stringListLookupResultType);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getJsonEncodedValue() {
/* 1 */             return this.jsonEncodedValue;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final StringListLookupResultType getType() {
/* 1 */             return this.type;
                }

                public final StringListResult copy(String jsonEncodedValue, StringListLookupResultType type) {
/* 1 */             type.getClass();
/* 6 */             return new StringListResult(jsonEncodedValue, type);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof StringListResult)) {
/* 7 */                 return false;
                    }
/* 11 */            StringListResult stringListResult = (StringListResult) other;
                    return Intrinsics.m6216a(this.jsonEncodedValue, stringListResult.jsonEncodedValue) && this.type == stringListResult.type;
                }

                public final String getJsonEncodedValue() {
/* 1 */             return this.jsonEncodedValue;
                }

                public final StringListLookupResultType getType() {
/* 1 */             return this.type;
                }

                public int hashCode() {
/* 1 */             String str = this.jsonEncodedValue;
/* 19 */            return this.type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
                }

                public final List<Object> toList() {
/* 9 */             return C2085pw.m7566e(this.jsonEncodedValue, this.type);
                }

                public String toString() {
/* 28 */            return "StringListResult(jsonEncodedValue=" + this.jsonEncodedValue + ", type=" + this.type + ")";
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, m6176d2 = {"Lio/flutter/plugins/sharedpreferences/StringListResult$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "fromList", "Lio/flutter/plugins/sharedpreferences/StringListResult;", "pigeonVar_list", HttpUrl.FRAGMENT_ENCODE_SET, "shared_preferences_android_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final StringListResult fromList(List<? extends Object> pigeonVar_list) {
/* 1 */                 pigeonVar_list.getClass();
/* 9 */                 String str = (String) pigeonVar_list.get(0);
/* 12 */                Object obj = pigeonVar_list.get(1);
/* 16 */                obj.getClass();
/* 23 */                return new StringListResult(str, (StringListLookupResultType) obj);
                    }

/* 4 */             private Companion() {
                    }
                }

/* 11 */        public /* synthetic */ StringListResult(String str, StringListLookupResultType stringListLookupResultType, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 12 */            this((i & 1) != 0 ? null : str, stringListLookupResultType);
                }
            }
