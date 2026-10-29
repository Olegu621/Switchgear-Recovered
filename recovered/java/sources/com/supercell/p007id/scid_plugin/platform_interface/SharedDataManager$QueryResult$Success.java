            package com.supercell.p007id.scid_plugin.platform_interface;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.fm0;
            import p000.jd2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0007J\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, m6176d2 = {"com/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$Success", "Ljd2;", HttpUrl.FRAGMENT_ENCODE_SET, SharedDataContentProvider.BASE_PATH, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$Success;", "copy", "(Ljava/lang/String;)Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$Success;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "()I", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getData", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final /* data */ class SharedDataManager$QueryResult$Success extends jd2 {
                private final String data;

                public SharedDataManager$QueryResult$Success(String str) {
/* 1 */             str.getClass();
/* 7 */             this.data = str;
                }

                public static /* synthetic */ SharedDataManager$QueryResult$Success copy$default(SharedDataManager$QueryResult$Success sharedDataManager$QueryResult$Success, String str, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = sharedDataManager$QueryResult$Success.data;
                    }
/* 7 */             return sharedDataManager$QueryResult$Success.copy(str);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getData() {
/* 1 */             return this.data;
                }

                public final SharedDataManager$QueryResult$Success copy(String data) {
/* 1 */             data.getClass();
/* 6 */             return new SharedDataManager$QueryResult$Success(data);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
                    return (other instanceof SharedDataManager$QueryResult$Success) && Intrinsics.m6216a(this.data, ((SharedDataManager$QueryResult$Success) other).data);
                }

                public final String getData() {
/* 1 */             return this.data;
                }

                public int hashCode() {
/* 3 */             return this.data.hashCode();
                }

                public String toString() {
/* 7 */             return fm0.m3784j("Success(data=", this.data, ")");
                }
            }
