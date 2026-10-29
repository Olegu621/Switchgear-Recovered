.class public final Lp91;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lfv0;

.field public b:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;


# direct methods
.method public constructor <init>(Lo91;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lp91;->a:Lfv0;

    .line 8
    .line 9
    new-instance p1, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 10
    .line 11
    invoke-direct {p1}, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lp91;->b:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lp91;->a:Lfv0;

    .line 2
    .line 3
    check-cast v0, Lo91;

    .line 4
    .line 5
    iget-object v1, v0, Lo91;->a:Ll91;

    .line 6
    .line 7
    iget-object v1, v1, Ll91;->a:Lod2;

    .line 8
    .line 9
    sget-object v2, Lfh2;->a:[Lfh2;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v1, v1, Lod2;->a:Landroid/content/SharedPreferences;

    .line 15
    .line 16
    const-string v2, "injected_location"

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    move-object v1, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    sget-object v2, Lcom/usercentrics/sdk/v2/location/data/LocationDataResponse;->Companion:Lcom/usercentrics/sdk/v2/location/data/LocationDataResponse$Companion;

    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/usercentrics/sdk/v2/location/data/LocationDataResponse$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    sget-object v4, Lb21;->a:Lr11;

    .line 34
    .line 35
    invoke-virtual {v4, v1, v2}, Lb11;->a(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lcom/usercentrics/sdk/v2/location/data/LocationDataResponse;

    .line 40
    .line 41
    iget-object v1, v1, Lcom/usercentrics/sdk/v2/location/data/LocationDataResponse;->a:Lcom/usercentrics/sdk/v2/location/data/LocationData;

    .line 42
    .line 43
    :goto_0
    if-eqz v1, :cond_1

    .line 44
    .line 45
    iget-object v1, v1, Lcom/usercentrics/sdk/v2/location/data/LocationData;->a:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move-object v1, v3

    .line 49
    :goto_1
    if-eqz v1, :cond_2

    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;->a()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_5

    .line 56
    .line 57
    :cond_2
    iget-object v0, v0, Lo91;->a:Ll91;

    .line 58
    .line 59
    iget-object v0, v0, Ll91;->a:Lod2;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v0, v0, Lod2;->a:Landroid/content/SharedPreferences;

    .line 65
    .line 66
    const-string v1, "location"

    .line 67
    .line 68
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_3

    .line 73
    .line 74
    move-object v0, v3

    .line 75
    goto :goto_2

    .line 76
    :cond_3
    sget-object v1, Lcom/usercentrics/sdk/v2/location/data/LocationDataResponse;->Companion:Lcom/usercentrics/sdk/v2/location/data/LocationDataResponse$Companion;

    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/usercentrics/sdk/v2/location/data/LocationDataResponse$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    sget-object v2, Lb21;->a:Lr11;

    .line 83
    .line 84
    invoke-virtual {v2, v0, v1}, Lb11;->a(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Lcom/usercentrics/sdk/v2/location/data/LocationDataResponse;

    .line 89
    .line 90
    iget-object v0, v0, Lcom/usercentrics/sdk/v2/location/data/LocationDataResponse;->a:Lcom/usercentrics/sdk/v2/location/data/LocationData;

    .line 91
    .line 92
    :goto_2
    if-eqz v0, :cond_4

    .line 93
    .line 94
    iget-object v3, v0, Lcom/usercentrics/sdk/v2/location/data/LocationData;->a:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 95
    .line 96
    :cond_4
    move-object v1, v3

    .line 97
    :cond_5
    if-eqz v1, :cond_7

    .line 98
    .line 99
    invoke-virtual {v1}, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;->a()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_6

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v1}, Lp91;->b(Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;)V

    .line 110
    .line 111
    .line 112
    const/4 p0, 0x1

    .line 113
    return p0

    .line 114
    :cond_7
    :goto_3
    const/4 p0, 0x0

    .line 115
    return p0
.end method

.method public final b(Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;->a()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iput-object p1, p0, Lp91;->b:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 12
    .line 13
    iget-object p0, p0, Lp91;->a:Lfv0;

    .line 14
    .line 15
    check-cast p0, Lo91;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lo91;->a:Ll91;

    .line 21
    .line 22
    new-instance v0, Lcom/usercentrics/sdk/v2/location/data/LocationDataResponse;

    .line 23
    .line 24
    new-instance v1, Lcom/usercentrics/sdk/v2/location/data/LocationData;

    .line 25
    .line 26
    invoke-direct {v1, p1}, Lcom/usercentrics/sdk/v2/location/data/LocationData;-><init>(Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/usercentrics/sdk/v2/location/data/LocationDataResponse;-><init>(Lcom/usercentrics/sdk/v2/location/data/LocationData;)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Lb21;->a:Lr11;

    .line 33
    .line 34
    iget-object v1, p1, Lb11;->b:Lb5;

    .line 35
    .line 36
    const-class v2, Lcom/usercentrics/sdk/v2/location/data/LocationDataResponse;

    .line 37
    .line 38
    invoke-static {v2}, Lj22;->b(Ljava/lang/Class;)Ljs2;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-static {v1, v2}, Ljb1;->z(Lb5;Lv21;)Lkotlinx/serialization/KSerializer;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p1, v1, v0}, Lb11;->b(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, Ll91;->a:Lod2;

    .line 54
    .line 55
    sget-object v0, Lfh2;->a:[Lfh2;

    .line 56
    .line 57
    const-string v0, "location"

    .line 58
    .line 59
    invoke-virtual {p0, v0, p1}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method
