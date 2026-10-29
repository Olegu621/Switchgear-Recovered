.class public final Lcom/google/android/gms/internal/drive/zzaf;
.super Ljava/lang/Object;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final fetchDriveId(Ltr0;Ljava/lang/String;)Lsr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Ljava/lang/String;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/drive/zzai;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzai;-><init>(Lcom/google/android/gms/internal/drive/zzaf;Ltr0;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Leb3;

    .line 7
    .line 8
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lor0;->doRead(Lgi;)Lgi;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final getAppFolder(Ltr0;)Lka0;
    .locals 0

    .line 1
    sget-object p0, Lea0;->a:Le9;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p0
.end method

.method public final getRootFolder(Ltr0;)Lka0;
    .locals 0

    .line 1
    sget-object p0, Lea0;->a:Le9;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p0
.end method

.method public final newCreateFileActivityBuilder()Lf20;
    .locals 2

    .line 1
    new-instance p0, Lf20;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/google/android/gms/internal/drive/zzt;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/drive/zzt;-><init>(I)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final newDriveContents(Ltr0;)Lsr1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/drive/zzah;

    .line 2
    .line 3
    const/high16 v1, 0x20000000

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/internal/drive/zzah;-><init>(Lcom/google/android/gms/internal/drive/zzaf;Ltr0;I)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Leb3;

    .line 9
    .line 10
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lor0;->doRead(Lgi;)Lgi;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final newOpenFileActivityBuilder()Lgq1;
    .locals 0

    .line 1
    new-instance p0, Lgq1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final query(Ltr0;Lcom/google/android/gms/drive/query/Query;)Lsr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Lcom/google/android/gms/drive/query/Query;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/google/android/gms/internal/drive/zzag;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzag;-><init>(Lcom/google/android/gms/internal/drive/zzaf;Ltr0;Lcom/google/android/gms/drive/query/Query;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Leb3;

    .line 9
    .line 10
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lor0;->doRead(Lgi;)Lgi;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const-string p0, "Query must be provided."

    .line 18
    .line 19
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public final requestSync(Ltr0;)Lsr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/drive/zzaj;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzaj;-><init>(Lcom/google/android/gms/internal/drive/zzaf;Ltr0;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Leb3;

    .line 7
    .line 8
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lgi;)Lgi;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method
