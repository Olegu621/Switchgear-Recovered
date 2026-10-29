            package com.supercell.p007id.scid_plugin;

            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u0002*\u0006\b\u0001\u0010\u0003 \u00002\u00020\u0002B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0002\u0010\fR\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\r"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/SingletonHolder;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "A", "creator", "Lkotlin/Function1;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "instance", "Ljava/lang/Object;", "getInstance", "arg", "(Ljava/lang/Object;)Ljava/lang/Object;", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public class SingletonHolder<T, A> {
                private Function1<? super A, ? extends T> creator;
                private volatile T instance;

                public SingletonHolder(Function1<? super A, ? extends T> function1) {
/* 1 */             function1.getClass();
/* 7 */             this.creator = function1;
                }

                public final T getInstance(A arg) {
                    T t;
/* 1 */             T t2 = this.instance;
/* 3 */             if (t2 != null) {
/* 31 */                return t2;
                    }
                    synchronized (this) {
/* 6 */                 t = this.instance;
/* 8 */                 if (t == null) {
/* 10 */                    Function1<? super A, ? extends T> function1 = this.creator;
/* 12 */                    function1.getClass();
/* 15 */                    t = (T) function1.invoke(arg);
/* 19 */                    this.instance = t;
/* 22 */                    this.creator = null;
                        }
                    }
                    return t;
                }
            }
