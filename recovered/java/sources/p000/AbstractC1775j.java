            package p000;

            import com.google.android.gms.common.data.DataHolder;
            import java.io.Closeable;
            import java.util.Iterator;
            
            /* JADX INFO: renamed from: j */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1775j implements Iterable, b32, Closeable {

                /* JADX INFO: renamed from: a */
                public final DataHolder f11978a;

                public AbstractC1775j(DataHolder dataHolder) {
/* 4 */             this.f11978a = dataHolder;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 1 */             release();
                }

                public abstract Object get(int i);

                public int getCount() {
/* 1 */             DataHolder dataHolder = this.f11978a;
/* 3 */             if (dataHolder == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return dataHolder.f3470v;
                }

                @Override // java.lang.Iterable
                public final Iterator iterator() {
/* 3 */             return new y30(this);
                }

                public void release() {
/* 1 */             DataHolder dataHolder = this.f11978a;
/* 3 */             if (dataHolder != null) {
/* 5 */                 dataHolder.close();
                    }
                }
            }
