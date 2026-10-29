            package p000;

            import java.io.File;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class wh0 extends vh0 {

                /* JADX INFO: renamed from: b */
                public boolean f18623b;

                /* JADX INFO: renamed from: c */
                public File[] f18624c;

                /* JADX INFO: renamed from: d */
                public int f18625d;

                /* JADX INFO: renamed from: e */
                public boolean f18626e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ zh0 f18627f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public wh0(zh0 zh0Var, File file) {
/* 6 */             super(file);
/* 1 */             file.getClass();
/* 4 */             this.f18627f = zh0Var;
                }

                /* JADX WARN: Code duplicated, block: B:25:0x0057  */
                /* JADX WARN: Code duplicated, block: B:27:0x005a  */
                /* JADX WARN: Code duplicated, block: B:29:0x005e  */
                @Override // p000.ai0
                /* JADX INFO: renamed from: a */
                public final File mo290a() {
                    File[] fileArr;
                    Function1 function1;
/* 3 */             bi0 bi0Var = this.f18627f.f20148d;
/* 5 */             boolean z = this.f18626e;
/* 9 */             File file = this.f289a;
/* 11 */            if (z || this.f18624c != null) {
/* 63 */                fileArr = this.f18624c;
/* 65 */                if (fileArr == null && this.f18625d < fileArr.length) {
/* 72 */                    fileArr.getClass();
/* 75 */                    int i = this.f18625d;
/* 79 */                    this.f18625d = i + 1;
/* 81 */                    return fileArr[i];
                        }
/* 86 */                if (!this.f18623b) {
/* 88 */                    this.f18623b = true;
/* 90 */                    return file;
                        }
/* 91 */                function1 = bi0Var.f2436d;
/* 93 */                if (function1 != null) {
/* 95 */                    function1.invoke(file);
                        }
                    } else {
/* 17 */                Function1 function2 = bi0Var.f2435c;
/* 19 */                if (function2 == null || ((Boolean) function2.invoke(file)).booleanValue()) {
/* 34 */                    File[] fileArrListFiles = file.listFiles();
/* 38 */                    this.f18624c = fileArrListFiles;
/* 40 */                    if (fileArrListFiles == null) {
/* 42 */                        Function2 function3 = bi0Var.f2437e;
/* 44 */                        if (function3 != null) {
/* 50 */                            File file2 = this.f289a;
/* 58 */                            function3.invoke(file2, new C1984o0(file2, null, "Cannot list files in a directory", 2, null));
                                }
/* 61 */                        this.f18626e = true;
                            }
/* 63 */                    fileArr = this.f18624c;
/* 65 */                    if (fileArr == null) {
                            }
/* 86 */                    if (!this.f18623b) {
/* 88 */                        this.f18623b = true;
/* 90 */                        return file;
                            }
/* 91 */                    function1 = bi0Var.f2436d;
/* 93 */                    if (function1 != null) {
/* 95 */                        function1.invoke(file);
                            }
                        }
                    }
/* 7 */             return null;
                }
            }
