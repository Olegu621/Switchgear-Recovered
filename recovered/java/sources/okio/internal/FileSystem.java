            package okio.internal;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.util.Iterator;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import kotlin.sequences.Sequence;
            import okhttp3.HttpUrl;
            import okio.BufferedSink;
            import okio.FileMetadata;
            import okio.Okio;
            import okio.Path;
            import okio.Source;
            import p000.C0840dd;
            import p000.C2066pd;
            import p000.c10;
            import p000.d10;
            import p000.ds0;
            import p000.fm0;
            import p000.j42;
            import p000.j50;
            import p000.jf0;
            import p000.mz0;
            import p000.q92;
            import p000.r92;
            
            /* JADX INFO: renamed from: okio.internal.-FileSystem, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\r\u001a)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aK\u0010\u001e\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001d\u0010 \u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, m6176d2 = {"Lokio/FileSystem;", "Lokio/Path;", "path", "Lokio/FileMetadata;", "commonMetadata", "(Lokio/FileSystem;Lokio/Path;)Lokio/FileMetadata;", HttpUrl.FRAGMENT_ENCODE_SET, "commonExists", "(Lokio/FileSystem;Lokio/Path;)Z", "dir", "mustCreate", HttpUrl.FRAGMENT_ENCODE_SET, "commonCreateDirectories", "(Lokio/FileSystem;Lokio/Path;Z)V", FirebaseAnalytics.Param.SOURCE, "target", "commonCopy", "(Lokio/FileSystem;Lokio/Path;Lokio/Path;)V", "fileOrDirectory", "mustExist", "commonDeleteRecursively", "followSymlinks", "Lkotlin/sequences/Sequence;", "commonListRecursively", "(Lokio/FileSystem;Lokio/Path;Z)Lkotlin/sequences/Sequence;", "Lr92;", "fileSystem", "Ldd;", "stack", "postorder", "collectRecursively", "(Lr92;Lokio/FileSystem;Ldd;Lokio/Path;ZZLc10;)Ljava/lang/Object;", "symlinkTarget", "(Lokio/FileSystem;Lokio/Path;)Lokio/Path;", "okio"}, m6177k = 2, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class FileSystem {

                /* JADX INFO: renamed from: okio.internal.-FileSystem$collectRecursively$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @j50(m5707c = "okio.internal.-FileSystem", m5708f = "FileSystem.kt", m5709l = {116, 135, 145}, m5710m = "collectRecursively")
                @Metadata(m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C20321 extends d10 {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    boolean Z$0;
                    boolean Z$1;
                    int label;
                    /* synthetic */ Object result;

                    public C20321(c10 c10Var) {
/* 1 */                 super(c10Var);
                    }

                    @Override // p000.AbstractC0181bi
                    public final Object invokeSuspend(Object obj) {
/* 1 */                 this.result = obj;
/* 8 */                 this.label |= Integer.MIN_VALUE;
/* 17 */                return FileSystem.collectRecursively(null, null, null, null, false, false, this);
                    }
                }

                /* JADX INFO: renamed from: okio.internal.-FileSystem$commonListRecursively$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m6176d2 = {"Lr92;", "Lokio/Path;", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Lr92;)V"}, m6177k = 3, m6178mv = {1, 8, 0})
                @j50(m5707c = "okio.internal.-FileSystem$commonListRecursively$1", m5708f = "FileSystem.kt", m5709l = {96}, m5710m = "invokeSuspend")
                public static final class C20331 extends j42 implements Function2<r92, c10, Object> {
                    final /* synthetic */ Path $dir;
                    final /* synthetic */ boolean $followSymlinks;
                    final /* synthetic */ okio.FileSystem $this_commonListRecursively;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    Object L$2;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C20331(Path path, okio.FileSystem fileSystem, boolean z, c10 c10Var) {
/* 8 */                 super(2, c10Var);
/* 1 */                 this.$dir = path;
/* 3 */                 this.$this_commonListRecursively = fileSystem;
/* 5 */                 this.$followSymlinks = z;
                    }

                    @Override // p000.AbstractC0181bi
                    public final c10 create(Object obj, c10 c10Var) {
/* 9 */                 C20331 c20331 = new C20331(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, c10Var);
/* 12 */                c20331.L$0 = obj;
/* 14 */                return c20331;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(r92 r92Var, c10 c10Var) {
/* 9 */                 return ((C20331) create(r92Var, c10Var)).invokeSuspend(Unit.f12910a);
                    }

                    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
                    /* JADX WARN: Code duplicated, block: B:13:0x0063 A[RETURN] */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0061 -> B:14:0x0064). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    @Override // p000.AbstractC0181bi
                    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                        /*
                            r11 = this;
                            z10 r0 = p000.z10.f19902a
                            int r1 = r11.label
                            r2 = 1
                            if (r1 == 0) goto L22
                            if (r1 != r2) goto L1b
                            java.lang.Object r1 = r11.L$2
                            java.util.Iterator r1 = (java.util.Iterator) r1
                            java.lang.Object r3 = r11.L$1
                            dd r3 = (p000.C0840dd) r3
                            java.lang.Object r4 = r11.L$0
                            r92 r4 = (p000.r92) r4
                            p000.pg3.m7417A(r12)
                            r10 = r11
                            r6 = r3
                            goto L64
                        L1b:
                            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                            p000.f42.m3656l(r11)
                            r11 = 0
                            return r11
                        L22:
                            p000.pg3.m7417A(r12)
                            java.lang.Object r12 = r11.L$0
                            r92 r12 = (p000.r92) r12
                            dd r1 = new dd
                            r1.<init>()
                            okio.Path r3 = r11.$dir
                            r1.addLast(r3)
                            okio.FileSystem r3 = r11.$this_commonListRecursively
                            okio.Path r4 = r11.$dir
                            java.util.List r3 = r3.list(r4)
                            java.util.Iterator r3 = r3.iterator()
                            r4 = r12
                            r6 = r1
                            r1 = r3
                        L42:
                            boolean r12 = r1.hasNext()
                            if (r12 == 0) goto L66
                            java.lang.Object r12 = r1.next()
                            r7 = r12
                            okio.Path r7 = (okio.Path) r7
                            okio.FileSystem r5 = r11.$this_commonListRecursively
                            boolean r8 = r11.$followSymlinks
                            r11.L$0 = r4
                            r11.L$1 = r6
                            r11.L$2 = r1
                            r11.label = r2
                            r9 = 0
                            r10 = r11
                            java.lang.Object r11 = okio.internal.FileSystem.collectRecursively(r4, r5, r6, r7, r8, r9, r10)
                            if (r11 != r0) goto L64
                            return r0
                        L64:
                            r11 = r10
                            goto L42
                        L66:
                            kotlin.Unit r11 = kotlin.Unit.f12910a
                            return r11
                        */
                        throw new UnsupportedOperationException("Method not decompiled: okio.internal.FileSystem.C20331.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: Code duplicated, block: B:49:0x00e6 A[Catch: all -> 0x0125, TRY_LEAVE, TryCatch #2 {all -> 0x0125, blocks: (B:47:0x00e0, B:49:0x00e6, B:46:0x00d8), top: B:73:0x00d8 }] */
                /* JADX WARN: Code duplicated, block: B:54:0x011c A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:55:0x011d  */
                /* JADX WARN: Code duplicated, block: B:7:0x001b  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x011d -> B:20:0x005d). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                public static final java.lang.Object collectRecursively(p000.r92 r16, okio.FileSystem r17, p000.C0840dd r18, okio.Path r19, boolean r20, boolean r21, p000.c10 r22) {
                    /*
                        Method dump skipped, instruction units count: 337
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: okio.internal.FileSystem.collectRecursively(r92, okio.FileSystem, dd, okio.Path, boolean, boolean, c10):java.lang.Object");
                }

                public static final void commonCopy(okio.FileSystem fileSystem, Path path, Path path2) throws IOException {
                    Long lValueOf;
                    Throwable th;
                    Long lValueOf2;
/* 1 */             fileSystem.getClass();
/* 4 */             path.getClass();
/* 7 */             path2.getClass();
/* 10 */            Source source = fileSystem.source(path);
/* 14 */            Throwable th2 = null;
                    try {
/* 19 */                BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(path2));
                        try {
/* 27 */                    lValueOf2 = Long.valueOf(bufferedSinkBuffer.writeAll(source));
/* 31 */                    if (bufferedSinkBuffer != null) {
                                try {
/* 33 */                            bufferedSinkBuffer.close();
                                } catch (Throwable th3) {
/* 37 */                            th = th3;
                                }
                            }
/* 39 */                    th = null;
                        } catch (Throwable th4) {
/* 42 */                    if (bufferedSinkBuffer != null) {
                                try {
/* 44 */                            bufferedSinkBuffer.close();
                                } catch (Throwable th5) {
/* 49 */                            jf0.m5798a(th4, th5);
                                }
                            }
/* 55 */                    th = th4;
/* 56 */                    lValueOf2 = null;
                        }
/* 57 */                if (th != null) {
/* 78 */                    throw th;
                        }
/* 59 */                lValueOf2.getClass();
/* 66 */                lValueOf = Long.valueOf(lValueOf2.longValue());
/* 70 */                if (source != null) {
                            try {
/* 72 */                        source.close();
                            } catch (Throwable th6) {
/* 76 */                        th2 = th6;
                            }
                        }
/* 92 */                if (th2 != null) {
/* 98 */                    throw th2;
                        }
/* 94 */                lValueOf.getClass();
                    } catch (Throwable th7) {
/* 79 */                if (source != null) {
                            try {
/* 81 */                        source.close();
                            } catch (Throwable th8) {
/* 86 */                        jf0.m5798a(th7, th8);
                            }
                        }
/* 90 */                th2 = th7;
/* 91 */                lValueOf = null;
                    }
                }

                public static final void commonCreateDirectories(okio.FileSystem fileSystem, Path path, boolean z) throws IOException {
/* 1 */             fileSystem.getClass();
/* 4 */             path.getClass();
/* 9 */             C0840dd c0840dd = new C0840dd();
/* 13 */            for (Path pathParent = path; pathParent != null && !fileSystem.exists(pathParent); pathParent = pathParent.parent()) {
/* 21 */                c0840dd.addFirst(pathParent);
                    }
/* 29 */            if (z && c0840dd.isEmpty()) {
/* 40 */                ds0.m3191h(path, " already exist.");
/* 43 */                return;
                    }
/* 44 */            Iterator<E> it = c0840dd.iterator();
/* 52 */            while (it.hasNext()) {
/* 60 */                fileSystem.createDirectory((Path) it.next());
                    }
                }

                public static final void commonDeleteRecursively(okio.FileSystem fileSystem, Path path, boolean z) throws IOException {
/* 1 */             fileSystem.getClass();
/* 4 */             path.getClass();
/* 10 */            FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$1 = new FileSystem$commonDeleteRecursively$sequence$1(fileSystem, path, null);
/* 15 */            q92 q92Var = new q92();
/* 22 */            q92Var.f15452c = mz0.m6833a(q92Var, q92Var, fileSystem$commonDeleteRecursively$sequence$1);
/* 28 */            while (q92Var.hasNext()) {
/* 47 */                fileSystem.delete((Path) q92Var.next(), z && !q92Var.hasNext());
                    }
                }

                public static final boolean commonExists(okio.FileSystem fileSystem, Path path) throws IOException {
/* 1 */             fileSystem.getClass();
/* 4 */             path.getClass();
                    return fileSystem.metadataOrNull(path) != null;
                }

                public static final Sequence<Path> commonListRecursively(okio.FileSystem fileSystem, Path path, boolean z) throws IOException {
/* 1 */             fileSystem.getClass();
/* 4 */             path.getClass();
/* 16 */            return new C2066pd(new C20331(path, fileSystem, z, null), 3);
                }

                public static final FileMetadata commonMetadata(okio.FileSystem fileSystem, Path path) throws IOException {
/* 1 */             fileSystem.getClass();
/* 4 */             path.getClass();
/* 7 */             FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
/* 11 */            if (fileMetadataMetadataOrNull != null) {
/* 13 */                return fileMetadataMetadataOrNull;
                    }
/* 25 */            throw new FileNotFoundException(fm0.m3792r(path, "no such file: "));
                }

                public static final Path symlinkTarget(okio.FileSystem fileSystem, Path path) throws IOException {
/* 1 */             fileSystem.getClass();
/* 4 */             path.getClass();
/* 11 */            Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
/* 15 */            if (symlinkTarget == null) {
/* 17 */                return null;
                    }
/* 19 */            Path pathParent = path.parent();
/* 23 */            pathParent.getClass();
/* 26 */            return pathParent.resolve(symlinkTarget);
                }
            }
