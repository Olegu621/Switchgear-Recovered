.class public final Lcom/google/android/gms/internal/drive/zzbi;
.super Ljava/lang/Object;

# interfaces
.implements Lfa0;


# static fields
.field private static final zzbz:Lmr0;


# instance fields
.field private closed:Z

.field private final zzes:Lcom/google/android/gms/drive/Contents;

.field private zzet:Z

.field private zzeu:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lmr0;

    .line 2
    .line 3
    const-string v1, "DriveContentsImpl"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lmr0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/google/android/gms/internal/drive/zzbi;->zzbz:Lmr0;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/drive/Contents;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzbi;->closed:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzbi;->zzet:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzbi;->zzeu:Z

    .line 10
    .line 11
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzbi;->zzes:Lcom/google/android/gms/drive/Contents;

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/drive/zzbi;)Lcom/google/android/gms/drive/Contents;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzbi;->zzes:Lcom/google/android/gms/drive/Contents;

    return-object p0
.end method

.method private final zza(Ltr0;Lhi1;Lgn3;)Lsr1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Lhi1;",
            "Lgn3;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzbi;->zzes:Lcom/google/android/gms/drive/Contents;

    .line 2
    .line 3
    iget p0, p0, Lcom/google/android/gms/drive/Contents;->c:I

    .line 4
    .line 5
    const/high16 p2, 0x10000000

    .line 6
    .line 7
    if-eq p0, p2, :cond_0

    .line 8
    .line 9
    sget-object p0, Lea0;->a:Le9;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p0

    .line 20
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string p1, "Cannot commit contents opened with MODE_READ_ONLY"

    .line 23
    .line 24
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p0
.end method

.method public static synthetic zzx()Lmr0;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/drive/zzbi;->zzbz:Lmr0;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final commit(Ltr0;Lhi1;)Lsr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Lhi1;",
            ")",
            "Lsr1;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 14
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/drive/zzbi;->zza(Ltr0;Lhi1;Lgn3;)Lsr1;

    move-result-object p0

    return-object p0
.end method

.method public final commit(Ltr0;Lhi1;Lkf0;)Lsr1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Lhi1;",
            "Lkf0;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-static {p3}, Lgn3;->a(Lkf0;)Lgn3;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    :goto_0
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/drive/zzbi;->zza(Ltr0;Lhi1;Lgn3;)Lsr1;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final discard(Ltr0;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzbi;->closed:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzbi;->zzj()V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/google/android/gms/internal/drive/zzbm;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzbm;-><init>(Lcom/google/android/gms/internal/drive/zzbi;Ltr0;)V

    .line 11
    .line 12
    .line 13
    check-cast p1, Leb3;

    .line 14
    .line 15
    iget-object p1, p1, Leb3;->b:Lor0;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lor0;->doWrite(Lgi;)Lgi;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/google/android/gms/internal/drive/zzbm;

    .line 22
    .line 23
    new-instance v0, Lcom/google/android/gms/internal/drive/zzbl;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/drive/zzbl;-><init>(Lcom/google/android/gms/internal/drive/zzbi;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResultCallback(Lq42;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    const-string p0, "DriveContents already closed."

    .line 33
    .line 34
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final getDriveId()Lcom/google/android/gms/drive/DriveId;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzbi;->zzes:Lcom/google/android/gms/drive/Contents;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/gms/drive/Contents;->d:Lcom/google/android/gms/drive/DriveId;

    .line 4
    .line 5
    return-object p0
.end method

.method public final getInputStream()Ljava/io/InputStream;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzbi;->closed:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzbi;->zzes:Lcom/google/android/gms/drive/Contents;

    .line 7
    .line 8
    iget v2, v0, Lcom/google/android/gms/drive/Contents;->c:I

    .line 9
    .line 10
    const/high16 v3, 0x10000000

    .line 11
    .line 12
    if-ne v2, v3, :cond_1

    .line 13
    .line 14
    iget-boolean v2, p0, Lcom/google/android/gms/internal/drive/zzbi;->zzet:Z

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    iput-boolean v1, p0, Lcom/google/android/gms/internal/drive/zzbi;->zzet:Z

    .line 20
    .line 21
    new-instance p0, Ljava/io/FileInputStream;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/google/android/gms/drive/Contents;->a:Landroid/os/ParcelFileDescriptor;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p0, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v0}, Lio/sentry/config/a;->c(Ljava/io/FileInputStream;Ljava/io/FileDescriptor;)Ljava/io/FileInputStream;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_0
    const-string p0, "getInputStream() can only be called once per Contents instance."

    .line 38
    .line 39
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_1
    const-string p0, "getInputStream() can only be used with contents opened with MODE_READ_ONLY."

    .line 44
    .line 45
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_2
    const-string p0, "Contents have been closed, cannot access the input stream."

    .line 50
    .line 51
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v1
.end method

.method public final getMode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzbi;->zzes:Lcom/google/android/gms/drive/Contents;

    .line 2
    .line 3
    iget p0, p0, Lcom/google/android/gms/drive/Contents;->c:I

    .line 4
    .line 5
    return p0
.end method

.method public final getOutputStream()Ljava/io/OutputStream;
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzbi;->closed:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_5

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzbi;->zzes:Lcom/google/android/gms/drive/Contents;

    .line 7
    .line 8
    iget v2, v0, Lcom/google/android/gms/drive/Contents;->c:I

    .line 9
    .line 10
    const/high16 v3, 0x20000000

    .line 11
    .line 12
    if-ne v2, v3, :cond_4

    .line 13
    .line 14
    iget-boolean v2, p0, Lcom/google/android/gms/internal/drive/zzbi;->zzeu:Z

    .line 15
    .line 16
    if-nez v2, :cond_3

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    iput-boolean v2, p0, Lcom/google/android/gms/internal/drive/zzbi;->zzeu:Z

    .line 20
    .line 21
    new-instance p0, Ljava/io/FileOutputStream;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/google/android/gms/drive/Contents;->a:Landroid/os/ParcelFileDescriptor;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p0, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-interface {v2}, Lio/sentry/c1;->l()Lio/sentry/m6;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Lio/sentry/m6;->isTracingEnabled()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    new-instance v2, Lio/sentry/instrumentation/file/g;

    .line 47
    .line 48
    sget-boolean v3, Lio/sentry/util/k;->a:Z

    .line 49
    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-interface {v3}, Lio/sentry/c1;->m()Lio/sentry/m1;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-interface {v3}, Lio/sentry/c1;->g()Lio/sentry/k1;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    :goto_0
    if-eqz v3, :cond_1

    .line 70
    .line 71
    const-string v4, "file.write"

    .line 72
    .line 73
    invoke-interface {v3, v4}, Lio/sentry/k1;->p(Ljava/lang/String;)Lio/sentry/k1;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    move-object v3, v1

    .line 79
    :goto_1
    new-instance v4, Lio/sentry/instrumentation/file/c;

    .line 80
    .line 81
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-interface {v5}, Lio/sentry/c1;->l()Lio/sentry/m6;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-direct {v4, v1, v3, p0, v5}, Lio/sentry/instrumentation/file/c;-><init>(Ljava/io/File;Lio/sentry/k1;Ljava/io/Closeable;Lio/sentry/m6;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {v2, v4, v0}, Lio/sentry/instrumentation/file/g;-><init>(Lio/sentry/instrumentation/file/c;Ljava/io/FileDescriptor;)V

    .line 93
    .line 94
    .line 95
    return-object v2

    .line 96
    :cond_2
    return-object p0

    .line 97
    :cond_3
    const-string p0, "getOutputStream() can only be called once per Contents instance."

    .line 98
    .line 99
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-object v1

    .line 103
    :cond_4
    const-string p0, "getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY."

    .line 104
    .line 105
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-object v1

    .line 109
    :cond_5
    const-string p0, "Contents have been closed, cannot access the output stream."

    .line 110
    .line 111
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object v1
.end method

.method public final getParcelFileDescriptor()Landroid/os/ParcelFileDescriptor;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzbi;->closed:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzbi;->zzes:Lcom/google/android/gms/drive/Contents;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/gms/drive/Contents;->a:Landroid/os/ParcelFileDescriptor;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string p0, "Contents have been closed, cannot access the output stream."

    .line 11
    .line 12
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public final reopenForWrite(Ltr0;)Lsr1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzbi;->closed:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzbi;->zzes:Lcom/google/android/gms/drive/Contents;

    .line 7
    .line 8
    iget v0, v0, Lcom/google/android/gms/drive/Contents;->c:I

    .line 9
    .line 10
    const/high16 v2, 0x10000000

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzbi;->zzj()V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lcom/google/android/gms/internal/drive/zzbj;

    .line 18
    .line 19
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzbj;-><init>(Lcom/google/android/gms/internal/drive/zzbi;Ltr0;)V

    .line 20
    .line 21
    .line 22
    check-cast p1, Leb3;

    .line 23
    .line 24
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lor0;->doRead(Lgi;)Lgi;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_0
    const-string p0, "reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY."

    .line 32
    .line 33
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_1
    const-string p0, "DriveContents already closed."

    .line 38
    .line 39
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v1
.end method

.method public final zzi()Lcom/google/android/gms/drive/Contents;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzbi;->zzes:Lcom/google/android/gms/drive/Contents;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zzj()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzbi;->zzes:Lcom/google/android/gms/drive/Contents;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/drive/Contents;->a:Landroid/os/ParcelFileDescriptor;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    :catch_0
    :cond_0
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzbi;->closed:Z

    .line 12
    .line 13
    return-void
.end method

.method public final zzk()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/android/gms/internal/drive/zzbi;->closed:Z

    .line 2
    .line 3
    return p0
.end method
