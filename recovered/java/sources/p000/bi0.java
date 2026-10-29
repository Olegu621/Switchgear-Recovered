            package p000;

            import java.io.File;
            import java.util.Iterator;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.p011io.FileWalkDirection;
            import kotlin.sequences.Sequence;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 23 */    public final class bi0 implements Sequence {

                /* JADX INFO: renamed from: a */
                public final File f2433a;

                /* JADX INFO: renamed from: b */
                public final FileWalkDirection f2434b;

                /* JADX INFO: renamed from: c */
                public final Function1 f2435c;

                /* JADX INFO: renamed from: d */
                public final Function1 f2436d;

                /* JADX INFO: renamed from: e */
                public final Function2 f2437e;

                /* JADX INFO: renamed from: f */
                public final int f2438f;

                public /* synthetic */ bi0(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function2, Function2 function3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 21 */            this(file, (i2 & 2) != 0 ? FileWalkDirection.f12920a : fileWalkDirection, function1, function2, function3, (i2 & 32) != 0 ? AbstractC0208c9.API_PRIORITY_OTHER : i);
                }

                @Override // kotlin.sequences.Sequence
                public final Iterator iterator() {
/* 3 */             return new zh0(this);
                }

/* 24 */        public bi0(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function2, Function2 function3, int i) {
/* 26 */            this.f2433a = file;
/* 27 */            this.f2434b = fileWalkDirection;
/* 28 */            this.f2435c = function1;
/* 29 */            this.f2436d = function2;
/* 30 */            this.f2437e = function3;
/* 31 */            this.f2438f = i;
                }
            }
