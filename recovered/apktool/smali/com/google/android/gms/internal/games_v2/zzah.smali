.class public final Lcom/google/android/gms/internal/games_v2/zzah;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public static zza(I)Ljava/lang/String;
    .locals 2

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    const-string p0, "ALL_TIME"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/16 v0, 0x1d

    .line 13
    .line 14
    const-string v1, "Unknown time span "

    .line 15
    .line 16
    invoke-static {v0, v1, p0}, Lds0;->f(ILjava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    const-string p0, "WEEKLY"

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_2
    const-string p0, "DAILY"

    .line 25
    .line 26
    return-object p0
.end method
