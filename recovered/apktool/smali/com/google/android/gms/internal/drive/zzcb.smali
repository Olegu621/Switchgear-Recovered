.class public final Lcom/google/android/gms/internal/drive/zzcb;
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
.method public final getFileUploadPreferences(Ltr0;)Lsr1;
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
    new-instance v0, Lcom/google/android/gms/internal/drive/zzcc;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzcc;-><init>(Lcom/google/android/gms/internal/drive/zzcb;Ltr0;)V

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

.method public final setFileUploadPreferences(Ltr0;Lci0;)Lsr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Lci0;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lcom/google/android/gms/internal/drive/zzei;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p2, Lcom/google/android/gms/internal/drive/zzei;

    .line 6
    .line 7
    new-instance v0, Lcom/google/android/gms/internal/drive/zzcd;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzcd;-><init>(Lcom/google/android/gms/internal/drive/zzcb;Ltr0;Lcom/google/android/gms/internal/drive/zzei;)V

    .line 10
    .line 11
    .line 12
    check-cast p1, Leb3;

    .line 13
    .line 14
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lgi;)Lgi;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    const-string p0, "Invalid preference value"

    .line 22
    .line 23
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method
