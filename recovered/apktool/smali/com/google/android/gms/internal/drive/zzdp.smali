.class public Lcom/google/android/gms/internal/drive/zzdp;
.super Ljava/lang/Object;

# interfaces
.implements Lla0;


# instance fields
.field protected final zzk:Lcom/google/android/gms/drive/DriveId;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/drive/DriveId;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzdp;->zzk:Lcom/google/android/gms/drive/DriveId;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public addChangeListener(Ltr0;Lss;)Lsr1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Lss;",
            ")",
            "Lsr1;"
        }
    .end annotation

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

.method public addChangeSubscription(Ltr0;)Lsr1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            ")",
            "Lsr1;"
        }
    .end annotation

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

.method public delete(Ltr0;)Lsr1;
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
    new-instance v0, Lcom/google/android/gms/internal/drive/zzdu;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzdu;-><init>(Lcom/google/android/gms/internal/drive/zzdp;Ltr0;)V

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

.method public getDriveId()Lcom/google/android/gms/drive/DriveId;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzdp;->zzk:Lcom/google/android/gms/drive/DriveId;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMetadata(Ltr0;)Lsr1;
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
    new-instance v0, Lcom/google/android/gms/internal/drive/zzdq;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/internal/drive/zzdq;-><init>(Lcom/google/android/gms/internal/drive/zzdp;Ltr0;Z)V

    .line 5
    .line 6
    .line 7
    check-cast p1, Leb3;

    .line 8
    .line 9
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lor0;->doRead(Lgi;)Lgi;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public listParents(Ltr0;)Lsr1;
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
    new-instance v0, Lcom/google/android/gms/internal/drive/zzdr;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzdr;-><init>(Lcom/google/android/gms/internal/drive/zzdp;Ltr0;)V

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

.method public removeChangeListener(Ltr0;Lss;)Lsr1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Lss;",
            ")",
            "Lsr1;"
        }
    .end annotation

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

.method public removeChangeSubscription(Ltr0;)Lsr1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            ")",
            "Lsr1;"
        }
    .end annotation

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

.method public setParents(Ltr0;Ljava/util/Set;)Lsr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/drive/DriveId;",
            ">;)",
            "Lsr1;"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    new-instance p2, Lcom/google/android/gms/internal/drive/zzds;

    .line 9
    .line 10
    invoke-direct {p2, p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzds;-><init>(Lcom/google/android/gms/internal/drive/zzdp;Ltr0;Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    check-cast p1, Leb3;

    .line 14
    .line 15
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 16
    .line 17
    invoke-virtual {p0, p2}, Lor0;->doWrite(Lgi;)Lgi;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    const-string p0, "ParentIds must be provided."

    .line 23
    .line 24
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public trash(Ltr0;)Lsr1;
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
    new-instance v0, Lcom/google/android/gms/internal/drive/zzdv;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzdv;-><init>(Lcom/google/android/gms/internal/drive/zzdp;Ltr0;)V

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

.method public untrash(Ltr0;)Lsr1;
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
    new-instance v0, Lcom/google/android/gms/internal/drive/zzdw;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzdw;-><init>(Lcom/google/android/gms/internal/drive/zzdp;Ltr0;)V

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

.method public updateMetadata(Ltr0;Lhi1;)Lsr1;
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

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/google/android/gms/internal/drive/zzdt;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzdt;-><init>(Lcom/google/android/gms/internal/drive/zzdp;Ltr0;Lhi1;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Leb3;

    .line 9
    .line 10
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lgi;)Lgi;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const-string p0, "ChangeSet must be provided."

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
