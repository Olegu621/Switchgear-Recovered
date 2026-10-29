            package com.supercell.p007id.scid_plugin.platform_interface;

            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.jd2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, m6176d2 = {"com/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$UnexpectedStructure", "Ljd2;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "columns", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$UnexpectedStructure;", "copy", "(Ljava/util/List;)Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$UnexpectedStructure;", "toString", "()Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "()I", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getColumns", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final /* data */ class SharedDataManager$QueryResult$UnexpectedStructure extends jd2 {
                private final List<String> columns;

                public SharedDataManager$QueryResult$UnexpectedStructure(List<String> list) {
/* 1 */             list.getClass();
/* 7 */             this.columns = list;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ SharedDataManager$QueryResult$UnexpectedStructure copy$default(SharedDataManager$QueryResult$UnexpectedStructure sharedDataManager$QueryResult$UnexpectedStructure, List list, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 list = sharedDataManager$QueryResult$UnexpectedStructure.columns;
                    }
/* 7 */             return sharedDataManager$QueryResult$UnexpectedStructure.copy(list);
                }

                public final List<String> component1() {
/* 1 */             return this.columns;
                }

                public final SharedDataManager$QueryResult$UnexpectedStructure copy(List<String> columns) {
/* 1 */             columns.getClass();
/* 6 */             return new SharedDataManager$QueryResult$UnexpectedStructure(columns);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
                    return (other instanceof SharedDataManager$QueryResult$UnexpectedStructure) && Intrinsics.m6216a(this.columns, ((SharedDataManager$QueryResult$UnexpectedStructure) other).columns);
                }

                public final List<String> getColumns() {
/* 1 */             return this.columns;
                }

                public int hashCode() {
/* 3 */             return this.columns.hashCode();
                }

                public String toString() {
/* 18 */            return "UnexpectedStructure(columns=" + this.columns + ")";
                }
            }
