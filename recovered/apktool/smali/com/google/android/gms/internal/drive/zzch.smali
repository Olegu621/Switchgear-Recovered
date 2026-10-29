.class public final Lcom/google/android/gms/internal/drive/zzch;
.super Lor0;


# static fields
.field private static final zzfn:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/drive/zzch;->zzfn:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lda0;)V
    .locals 6

    .line 13
    sget-object v3, Lea0;->b:Lh9;

    sget-object v5, Lnr0;->c:Lnr0;

    move-object v2, p1

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    .line 14
    invoke-direct/range {v0 .. v5}, Lor0;-><init>(Landroid/content/Context;Landroid/app/Activity;Lh9;Lb9;Lnr0;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lda0;)V
    .locals 6

    .line 1
    sget-object v3, Lea0;->b:Lh9;

    .line 2
    .line 3
    sget-object v5, Lnr0;->c:Lnr0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move-object v4, p2

    .line 9
    invoke-direct/range {v0 .. v5}, Lor0;-><init>(Landroid/content/Context;Landroid/app/Activity;Lh9;Lb9;Lnr0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static final synthetic zza(Lcom/google/android/gms/internal/drive/zzg;Lcom/google/android/gms/tasks/Task;)Lw81;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 20
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 21
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p0

    throw p0
.end method

.method public static final zza(Lv81;Lcom/google/android/gms/tasks/Task;)Lw81;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance p1, Lcom/google/android/gms/internal/drive/zzg;

    .line 8
    .line 9
    iget-object p0, p0, Lv81;->c:Lt81;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/drive/zzg;-><init>(Lt81;)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    throw p0
.end method

.method private static zze(I)V
    .locals 1

    .line 1
    const/high16 v0, 0x10000000

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    const/high16 v0, 0x20000000

    .line 6
    .line 7
    if-eq p0, v0, :cond_1

    .line 8
    .line 9
    const/high16 v0, 0x30000000

    .line 10
    .line 11
    if-ne p0, v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p0, "Invalid openMode provided"

    .line 15
    .line 16
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final addChangeListener(Lla0;Lup1;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla0;",
            "Lup1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw81;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "listener"

    .line 9
    .line 10
    invoke-static {p2, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lcom/google/android/gms/internal/drive/zzdi;

    .line 14
    .line 15
    invoke-interface {p1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, p0, p2, v1}, Lcom/google/android/gms/internal/drive/zzdi;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lup1;Lcom/google/android/gms/drive/DriveId;)V

    .line 20
    .line 21
    .line 22
    sget-object p2, Lcom/google/android/gms/internal/drive/zzch;->zzfn:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const/16 v2, 0x1b

    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 33
    .line 34
    .line 35
    const-string v2, "OnChangeListener"

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p0, v0, p2}, Lor0;->registerListener(Ljava/lang/Object;Ljava/lang/String;)Lv81;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    new-instance v1, Lcom/google/android/gms/internal/drive/zzcp;

    .line 52
    .line 53
    invoke-direct {v1, p0, p2, p1, v0}, Lcom/google/android/gms/internal/drive/zzcp;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lv81;Lla0;Lcom/google/android/gms/internal/drive/zzdi;)V

    .line 54
    .line 55
    .line 56
    new-instance v2, Lcom/google/android/gms/internal/drive/zzcq;

    .line 57
    .line 58
    iget-object v3, p2, Lv81;->c:Lt81;

    .line 59
    .line 60
    invoke-direct {v2, p0, v3, p1, v0}, Lcom/google/android/gms/internal/drive/zzcq;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lt81;Lla0;Lcom/google/android/gms/internal/drive/zzdi;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v1, v2}, Lor0;->doRegisterEventListener(Lp22;Lcy2;)Lcom/google/android/gms/tasks/Task;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    new-instance p1, Lcom/google/android/gms/internal/drive/zzci;

    .line 68
    .line 69
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/drive/zzci;-><init>(Lv81;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->continueWith(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method

.method public final addChangeSubscription(Lla0;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla0;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-static {v0}, Lkb1;->g(Z)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lcom/google/android/gms/internal/drive/zzcr;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzcr;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lla0;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final cancelOpenFileCallback(Lw81;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw81;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/drive/zzg;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/google/android/gms/internal/drive/zzg;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/drive/zzg;->zzad()Lt81;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Lor0;->doUnregisterEventListener(Lt81;)Lcom/google/android/gms/tasks/Task;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, "Unrecognized ListenerToken"

    .line 17
    .line 18
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public final commitContents(Lfa0;Lhi1;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfa0;",
            "Lhi1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 59
    new-instance v0, Lgn3;

    .line 60
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    .line 61
    iput-boolean v1, v0, Lgn3;->a:Z

    .line 62
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/drive/zzch;->commitContents(Lfa0;Lhi1;Lkf0;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public final commitContents(Lfa0;Lhi1;Lkf0;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfa0;",
            "Lhi1;",
            "Lkf0;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "Execution options cannot be null."

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lfa0;->zzk()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    xor-int/2addr v0, v1

    .line 12
    const-string v2, "DriveContents is already closed"

    .line 13
    .line 14
    invoke-static {v2, v0}, Lkb1;->f(Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Lfa0;->getMode()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/high16 v2, 0x10000000

    .line 22
    .line 23
    if-eq v0, v2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    const-string v0, "Cannot commit contents opened in MODE_READ_ONLY."

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkb1;->f(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Lfa0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "Only DriveContents obtained through DriveFile.open can be committed."

    .line 37
    .line 38
    invoke-static {v0, v1}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p3}, Lgn3;->a(Lkf0;)Lgn3;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    if-nez p2, :cond_1

    .line 46
    .line 47
    sget-object p2, Lhi1;->b:Lhi1;

    .line 48
    .line 49
    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/drive/zzcy;

    .line 50
    .line 51
    invoke-direct {v0, p0, p3, p1, p2}, Lcom/google/android/gms/internal/drive/zzcy;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lgn3;Lfa0;Lhi1;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public final createContents()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lfa0;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/drive/zzcw;

    .line 2
    .line 3
    const/high16 v1, 0x20000000

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/drive/zzcw;-><init>(Lcom/google/android/gms/internal/drive/zzch;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final createFile(Lka0;Lhi1;Lfa0;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lka0;",
            "Lhi1;",
            "Lfa0;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lja0;",
            ">;"
        }
    .end annotation

    .line 19
    new-instance v0, Lkf0;

    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/drive/zzch;->createFile(Lka0;Lhi1;Lfa0;Lkf0;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public final createFile(Lka0;Lhi1;Lfa0;Lkf0;)Lcom/google/android/gms/tasks/Task;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lka0;",
            "Lhi1;",
            "Lfa0;",
            "Lkf0;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lja0;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lcom/google/android/gms/internal/drive/zzbs;->zzb(Lhi1;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/drive/zzdh;

    .line 5
    .line 6
    const/4 v5, 0x0

    .line 7
    move-object v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move-object v3, p3

    .line 10
    move-object v4, p4

    .line 11
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/drive/zzdh;-><init>(Lka0;Lhi1;Lfa0;Lkf0;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public final createFolder(Lka0;Lhi1;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lka0;",
            "Lhi1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lka0;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "MetadataChangeSet must be provided."

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Lhi1;->a()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p2}, Lhi1;->a()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "application/vnd.google-apps.folder"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string p0, "The mimetype must be of type application/vnd.google-apps.folder"

    .line 26
    .line 27
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0

    .line 32
    :cond_1
    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/drive/zzdb;

    .line 33
    .line 34
    invoke-direct {v0, p0, p2, p1}, Lcom/google/android/gms/internal/drive/zzdb;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lhi1;Lka0;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public final delete(Lla0;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla0;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/google/android/gms/internal/drive/zzcl;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzcl;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lla0;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final discardContents(Lfa0;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfa0;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lfa0;->zzk()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    const-string v1, "DriveContents is already closed"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lkb1;->f(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Lfa0;->zzj()V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lcom/google/android/gms/internal/drive/zzda;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzda;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lfa0;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final getAppFolder()Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lka0;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/drive/zzco;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/drive/zzco;-><init>(Lcom/google/android/gms/internal/drive/zzch;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lor0;->doRead(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final getMetadata(Lla0;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla0;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ldi1;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "DriveResource must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "Resource\'s DriveId must not be null"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lcom/google/android/gms/internal/drive/zzdc;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/internal/drive/zzdc;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lla0;Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lor0;->doRead(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final getRootFolder()Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lka0;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/drive/zzck;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/drive/zzck;-><init>(Lcom/google/android/gms/internal/drive/zzch;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lor0;->doRead(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final listChildren(Lka0;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lka0;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lgi1;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "folder cannot be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-interface {p1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/drive/zzbs;->zza(Lcom/google/android/gms/drive/query/Query;Lcom/google/android/gms/drive/DriveId;)Lcom/google/android/gms/drive/query/Query;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/drive/zzch;->query(Lcom/google/android/gms/drive/query/Query;)Lcom/google/android/gms/tasks/Task;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final listParents(Lla0;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla0;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lgi1;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/google/android/gms/internal/drive/zzde;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzde;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lla0;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lor0;->doRead(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final openFile(Lja0;I)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lja0;",
            "I)",
            "Lcom/google/android/gms/tasks/Task<",
            "Lfa0;",
            ">;"
        }
    .end annotation

    .line 68
    invoke-static {p2}, Lcom/google/android/gms/internal/drive/zzch;->zze(I)V

    .line 69
    new-instance v0, Lcom/google/android/gms/internal/drive/zzct;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzct;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lja0;I)V

    invoke-virtual {p0, v0}, Lor0;->doRead(Lum2;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public final openFile(Lja0;ILiq1;)Lcom/google/android/gms/tasks/Task;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lja0;",
            "I",
            "Liq1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw81;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lcom/google/android/gms/internal/drive/zzch;->zze(I)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/google/android/gms/internal/drive/zzch;->zzfn:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const/16 v2, 0x1b

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 15
    .line 16
    .line 17
    const-string v2, "OpenFileCallback"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0, p3, v0}, Lor0;->registerListener(Ljava/lang/Object;Ljava/lang/String;)Lv81;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object p3, v3, Lv81;->c:Lt81;

    .line 34
    .line 35
    new-instance v6, Lcom/google/android/gms/internal/drive/zzg;

    .line 36
    .line 37
    invoke-direct {v6, p3}, Lcom/google/android/gms/internal/drive/zzg;-><init>(Lt81;)V

    .line 38
    .line 39
    .line 40
    new-instance v1, Lcom/google/android/gms/internal/drive/zzcu;

    .line 41
    .line 42
    move-object v7, v3

    .line 43
    move-object v2, p0

    .line 44
    move-object v4, p1

    .line 45
    move v5, p2

    .line 46
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/drive/zzcu;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lv81;Lja0;ILcom/google/android/gms/internal/drive/zzg;Lv81;)V

    .line 47
    .line 48
    .line 49
    new-instance p0, Lcom/google/android/gms/internal/drive/zzcv;

    .line 50
    .line 51
    invoke-direct {p0, v2, p3, v6}, Lcom/google/android/gms/internal/drive/zzcv;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lt81;Lcom/google/android/gms/internal/drive/zzg;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v1, p0}, Lor0;->doRegisterEventListener(Lp22;Lcy2;)Lcom/google/android/gms/tasks/Task;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-instance p1, Lcom/google/android/gms/internal/drive/zzcj;

    .line 59
    .line 60
    invoke-direct {p1, v6}, Lcom/google/android/gms/internal/drive/zzcj;-><init>(Lcom/google/android/gms/internal/drive/zzg;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->continueWith(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method

.method public final query(Lcom/google/android/gms/drive/query/Query;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/drive/query/Query;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lgi1;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "query cannot be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/google/android/gms/internal/drive/zzcz;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzcz;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lcom/google/android/gms/drive/query/Query;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lor0;->doRead(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final queryChildren(Lka0;Lcom/google/android/gms/drive/query/Query;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lka0;",
            "Lcom/google/android/gms/drive/query/Query;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lgi1;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "folder cannot be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "query cannot be null."

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/drive/zzbs;->zza(Lcom/google/android/gms/drive/query/Query;Lcom/google/android/gms/drive/DriveId;)Lcom/google/android/gms/drive/query/Query;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/drive/zzch;->query(Lcom/google/android/gms/drive/query/Query;)Lcom/google/android/gms/tasks/Task;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final removeChangeListener(Lw81;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw81;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "Token is required to unregister listener."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/google/android/gms/internal/drive/zzg;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, Lcom/google/android/gms/internal/drive/zzg;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/android/gms/internal/drive/zzg;->zzad()Lt81;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Lor0;->doUnregisterEventListener(Lt81;)Lcom/google/android/gms/tasks/Task;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    const-string p0, "Could not recover key from ListenerToken"

    .line 22
    .line 23
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public final removeChangeSubscription(Lla0;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla0;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-static {v0}, Lkb1;->g(Z)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lcom/google/android/gms/internal/drive/zzcs;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzcs;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lla0;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final reopenContentsForWrite(Lfa0;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfa0;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lfa0;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lfa0;->zzk()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    xor-int/2addr v0, v1

    .line 7
    const-string v2, "DriveContents is already closed"

    .line 8
    .line 9
    invoke-static {v2, v0}, Lkb1;->f(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Lfa0;->getMode()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/high16 v2, 0x10000000

    .line 17
    .line 18
    if-ne v0, v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    :goto_0
    const-string v0, "This method can only be called on contents that are currently opened in MODE_READ_ONLY."

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkb1;->f(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Lfa0;->zzj()V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lcom/google/android/gms/internal/drive/zzcx;

    .line 31
    .line 32
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzcx;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lfa0;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lor0;->doRead(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public final setParents(Lla0;Ljava/util/Set;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla0;",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/drive/DriveId;",
            ">;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p2}, Lkb1;->n(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    new-instance p2, Lcom/google/android/gms/internal/drive/zzdf;

    .line 17
    .line 18
    invoke-direct {p2, p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzdf;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lla0;Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p2}, Lor0;->doWrite(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final trash(Lla0;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla0;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/google/android/gms/internal/drive/zzcm;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzcm;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lla0;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final untrash(Lla0;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla0;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/google/android/gms/internal/drive/zzcn;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzcn;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lla0;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final updateMetadata(Lla0;Lhi1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla0;",
            "Lhi1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ldi1;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p2}, Lkb1;->n(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/internal/drive/zzdd;

    .line 12
    .line 13
    invoke-direct {v0, p0, p2, p1}, Lcom/google/android/gms/internal/drive/zzdd;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lhi1;Lla0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
