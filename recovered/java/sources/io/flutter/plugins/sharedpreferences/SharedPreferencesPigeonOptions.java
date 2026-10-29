            package io.flutter.plugins.sharedpreferences;

            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.C2085pw;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m6176d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", HttpUrl.FRAGMENT_ENCODE_SET, "fileName", HttpUrl.FRAGMENT_ENCODE_SET, "useDataStore", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "(Ljava/lang/String;Z)V", "getFileName", "()Ljava/lang/String;", "getUseDataStore", "()Z", "toList", HttpUrl.FRAGMENT_ENCODE_SET, "component1", "component2", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "Companion", "shared_preferences_android_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 2 */     public final /* data */ class SharedPreferencesPigeonOptions {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String fileName;
                private final boolean useDataStore;

                public /* synthetic */ SharedPreferencesPigeonOptions(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 6 */             this((i & 1) != 0 ? null : str, z);
                }

                public static /* synthetic */ SharedPreferencesPigeonOptions copy$default(SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions, String str, boolean z, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = sharedPreferencesPigeonOptions.fileName;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                z = sharedPreferencesPigeonOptions.useDataStore;
                    }
/* 13 */            return sharedPreferencesPigeonOptions.copy(str, z);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getFileName() {
/* 1 */             return this.fileName;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final boolean getUseDataStore() {
/* 1 */             return this.useDataStore;
                }

                public final SharedPreferencesPigeonOptions copy(String fileName, boolean useDataStore) {
/* 3 */             return new SharedPreferencesPigeonOptions(fileName, useDataStore);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof SharedPreferencesPigeonOptions)) {
/* 7 */                 return false;
                    }
/* 11 */            SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions = (SharedPreferencesPigeonOptions) other;
                    return Intrinsics.m6216a(this.fileName, sharedPreferencesPigeonOptions.fileName) && this.useDataStore == sharedPreferencesPigeonOptions.useDataStore;
                }

                public final String getFileName() {
/* 1 */             return this.fileName;
                }

                public final boolean getUseDataStore() {
/* 1 */             return this.useDataStore;
                }

                public int hashCode() {
/* 1 */             String str = this.fileName;
/* 19 */            return Boolean.hashCode(this.useDataStore) + ((str == null ? 0 : str.hashCode()) * 31);
                }

                public final List<Object> toList() {
/* 13 */            return C2085pw.m7566e(this.fileName, Boolean.valueOf(this.useDataStore));
                }

                public String toString() {
/* 28 */            return "SharedPreferencesPigeonOptions(fileName=" + this.fileName + ", useDataStore=" + this.useDataStore + ")";
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, m6176d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "fromList", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", "pigeonVar_list", HttpUrl.FRAGMENT_ENCODE_SET, "shared_preferences_android_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final SharedPreferencesPigeonOptions fromList(List<? extends Object> pigeonVar_list) {
/* 1 */                 pigeonVar_list.getClass();
/* 9 */                 String str = (String) pigeonVar_list.get(0);
/* 12 */                Object obj = pigeonVar_list.get(1);
/* 16 */                obj.getClass();
/* 27 */                return new SharedPreferencesPigeonOptions(str, ((Boolean) obj).booleanValue());
                    }

/* 4 */             private Companion() {
                    }
                }

/* 9 */         public SharedPreferencesPigeonOptions(String str, boolean z) {
                    this.fileName = str;
                    this.useDataStore = z;
                }
            }
