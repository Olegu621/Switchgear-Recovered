.class public final Lcom/google/android/gms/internal/drive/zzbn;
.super Lcom/google/android/gms/internal/drive/zzdp;

# interfaces
.implements Lja0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/drive/DriveId;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/drive/zzdp;-><init>(Lcom/google/android/gms/drive/DriveId;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final open(Ltr0;ILia0;)Lsr1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "I",
            "Lia0;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    const/high16 v0, 0x10000000

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq p2, v0, :cond_1

    .line 5
    .line 6
    const/high16 v0, 0x20000000

    .line 7
    .line 8
    if-eq p2, v0, :cond_1

    .line 9
    .line 10
    const/high16 v0, 0x30000000

    .line 11
    .line 12
    if-ne p2, v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "Invalid mode provided."

    .line 16
    .line 17
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_1
    :goto_0
    if-nez p3, :cond_2

    .line 22
    .line 23
    new-instance p3, Lcom/google/android/gms/internal/drive/zzbo;

    .line 24
    .line 25
    invoke-direct {p3, p0, p1, p2, v1}, Lcom/google/android/gms/internal/drive/zzbo;-><init>(Lcom/google/android/gms/internal/drive/zzbn;Ltr0;ILia0;)V

    .line 26
    .line 27
    .line 28
    check-cast p1, Leb3;

    .line 29
    .line 30
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 31
    .line 32
    invoke-virtual {p0, p3}, Lor0;->doRead(Lgi;)Lgi;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lf42;->p()V

    .line 41
    .line 42
    .line 43
    return-object v1
.end method
