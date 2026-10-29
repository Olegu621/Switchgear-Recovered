            package com.supercell.p007id.scid_plugin.platform_interface;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.jd2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\n\u001a\u00020\t2\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, m6176d2 = {"com/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$QueryException", "Ljd2;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "component1", "()Ljava/lang/Exception;", "Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$QueryException;", "copy", "(Ljava/lang/Exception;)Lcom/supercell/id/scid_plugin/platform_interface/SharedDataManager$QueryResult$QueryException;", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "()I", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Exception;", "getException", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final /* data */ class SharedDataManager$QueryResult$QueryException extends jd2 {
                private final Exception exception;

                public SharedDataManager$QueryResult$QueryException(Exception exc) {
/* 1 */             exc.getClass();
/* 7 */             this.exception = exc;
                }

                public static /* synthetic */ SharedDataManager$QueryResult$QueryException copy$default(SharedDataManager$QueryResult$QueryException sharedDataManager$QueryResult$QueryException, Exception exc, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 exc = sharedDataManager$QueryResult$QueryException.exception;
                    }
/* 7 */             return sharedDataManager$QueryResult$QueryException.copy(exc);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final Exception getException() {
/* 1 */             return this.exception;
                }

                public final SharedDataManager$QueryResult$QueryException copy(Exception exception) {
/* 1 */             exception.getClass();
/* 6 */             return new SharedDataManager$QueryResult$QueryException(exception);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
                    return (other instanceof SharedDataManager$QueryResult$QueryException) && Intrinsics.m6216a(this.exception, ((SharedDataManager$QueryResult$QueryException) other).exception);
                }

                public final Exception getException() {
/* 1 */             return this.exception;
                }

                public int hashCode() {
/* 3 */             return this.exception.hashCode();
                }

                public String toString() {
/* 18 */            return "QueryException(exception=" + this.exception + ")";
                }
            }
