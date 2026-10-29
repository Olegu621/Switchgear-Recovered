            package okio.internal;

            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import okhttp3.HttpUrl;
            import okio.FileSystem;
            import okio.Path;
            import p000.C0840dd;
            import p000.c10;
            import p000.f42;
            import p000.j42;
            import p000.j50;
            import p000.pg3;
            import p000.r92;
            import p000.z10;
            
            /* JADX INFO: renamed from: okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m6176d2 = {"Lr92;", "Lokio/Path;", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Lr92;)V"}, m6177k = 3, m6178mv = {1, 8, 0})
            @j50(m5707c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", m5708f = "FileSystem.kt", m5709l = {75}, m5710m = "invokeSuspend")
            public final class FileSystem$commonDeleteRecursively$sequence$1 extends j42 implements Function2<r92, c10, Object> {
                final /* synthetic */ Path $fileOrDirectory;
                final /* synthetic */ FileSystem $this_commonDeleteRecursively;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FileSystem$commonDeleteRecursively$sequence$1(FileSystem fileSystem, Path path, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.$this_commonDeleteRecursively = fileSystem;
/* 3 */             this.$fileOrDirectory = path;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$1 = new FileSystem$commonDeleteRecursively$sequence$1(this.$this_commonDeleteRecursively, this.$fileOrDirectory, c10Var);
/* 10 */            fileSystem$commonDeleteRecursively$sequence$1.L$0 = obj;
/* 12 */            return fileSystem$commonDeleteRecursively$sequence$1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(r92 r92Var, c10 c10Var) {
/* 9 */             return ((FileSystem$commonDeleteRecursively$sequence$1) create(r92Var, c10Var)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.label;
/* 6 */             if (i == 0) {
/* 21 */                pg3.m7417A(obj);
/* 27 */                r92 r92Var = (r92) this.L$0;
/* 29 */                FileSystem fileSystem = this.$this_commonDeleteRecursively;
/* 33 */                C0840dd c0840dd = new C0840dd();
/* 36 */                Path path = this.$fileOrDirectory;
/* 38 */                this.label = 1;
/* 47 */                if (FileSystem.collectRecursively(r92Var, fileSystem, c0840dd, path, false, true, this) == z10Var) {
/* 49 */                    return z10Var;
                        }
                    } else {
/* 8 */                 if (i != 1) {
/* 16 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 19 */                    return null;
                        }
/* 10 */                pg3.m7417A(obj);
                    }
/* 50 */            return Unit.f12910a;
                }
            }
