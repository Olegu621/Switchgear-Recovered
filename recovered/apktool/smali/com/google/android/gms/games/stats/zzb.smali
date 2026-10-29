.class public final Lcom/google/android/gms/games/stats/zzb;
.super Lz30;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/gms/games/stats/PlayerStats;


# instance fields
.field public d:Landroid/os/Bundle;


# virtual methods
.method public final A1()F
    .locals 1

    .line 1
    const-string v0, "ave_session_length_minutes"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->b(Ljava/lang/String;)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final N()F
    .locals 2

    .line 1
    const-string v0, "total_spend_next_28_days"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->r(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/high16 p0, -0x40800000    # -1.0f

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    invoke-virtual {p0, v0}, Lz30;->b(Ljava/lang/String;)F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final describeContents()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/android/gms/games/stats/PlayerStatsEntity;->F1(Lcom/google/android/gms/games/stats/PlayerStats;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/games/stats/PlayerStatsEntity;->D1(Lcom/google/android/gms/games/stats/PlayerStats;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final i()F
    .locals 1

    .line 1
    const-string v0, "churn_probability"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->b(Ljava/lang/String;)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final k1()F
    .locals 2

    .line 1
    const-string v0, "high_spender_probability"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->r(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/high16 p0, -0x40800000    # -1.0f

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    invoke-virtual {p0, v0}, Lz30;->b(Ljava/lang/String;)F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final m1()I
    .locals 1

    .line 1
    const-string v0, "days_since_last_played"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->d(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final p0()F
    .locals 1

    .line 1
    const-string v0, "num_sessions_percentile"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->b(Ljava/lang/String;)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final t()I
    .locals 1

    .line 1
    const-string v0, "num_sessions"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->d(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final t0()F
    .locals 2

    .line 1
    const-string v0, "spend_probability"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->r(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/high16 p0, -0x40800000    # -1.0f

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    invoke-virtual {p0, v0}, Lz30;->b(Ljava/lang/String;)F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/games/stats/PlayerStatsEntity;->E1(Lcom/google/android/gms/games/stats/PlayerStats;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final u0()I
    .locals 1

    .line 1
    const-string v0, "num_purchases"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->d(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    new-instance p2, Lcom/google/android/gms/games/stats/PlayerStatsEntity;

    .line 2
    .line 3
    invoke-direct {p2, p0}, Lcom/google/android/gms/games/stats/PlayerStatsEntity;-><init>(Lcom/google/android/gms/games/stats/zzb;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, p1}, Ltc3;->a(Lcom/google/android/gms/games/stats/PlayerStatsEntity;Landroid/os/Parcel;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final y()F
    .locals 1

    .line 1
    const-string v0, "spend_percentile"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->b(Ljava/lang/String;)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
