.class public final Lcom/google/android/gms/games/event/EventRef;
.super Lz30;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/gms/games/event/Event;


# virtual methods
.method public final c()Landroid/net/Uri;
    .locals 1

    .line 1
    const-string v0, "icon_image_uri"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->w(Ljava/lang/String;)Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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
    invoke-static {p0, p1}, Lcom/google/android/gms/games/event/EventEntity;->F1(Lcom/google/android/gms/games/event/Event;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "external_event_id"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "description"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getIconImageUrl()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "icon_image_url"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getValue()J
    .locals 2

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->e(Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/games/event/EventEntity;->D1(Lcom/google/android/gms/games/event/Event;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final isVisible()Z
    .locals 1

    .line 1
    const-string v0, "visibility"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->a(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final p()Lcom/google/android/gms/games/Player;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/games/PlayerRef;

    .line 2
    .line 3
    iget-object v1, p0, Lz30;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 4
    .line 5
    iget p0, p0, Lz30;->b:I

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lcom/google/android/gms/games/PlayerRef;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final q1()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "formatted_value"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/games/event/EventEntity;->E1(Lcom/google/android/gms/games/event/Event;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/games/event/EventEntity;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/gms/games/event/EventEntity;-><init>(Lcom/google/android/gms/games/event/EventRef;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/event/EventEntity;->writeToParcel(Landroid/os/Parcel;I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
