.class public final Lpz2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lg80;


# instance fields
.field public final a:Lwe2;

.field public final b:Li03;

.field public final c:Ljava/util/ArrayList;

.field public final d:Lod2;

.field public final e:Lod2;

.field public f:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

.field public g:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;


# direct methods
.method public constructor <init>(Lwe2;Li03;ILjava/util/ArrayList;La21;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpz2;->a:Lwe2;

    .line 5
    .line 6
    iput-object p2, p0, Lpz2;->b:Li03;

    .line 7
    .line 8
    iput-object p4, p0, Lpz2;->c:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object p2, p1, Lwe2;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p2, Lod2;

    .line 13
    .line 14
    iput-object p2, p0, Lpz2;->d:Lod2;

    .line 15
    .line 16
    iget-object p1, p1, Lwe2;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lod2;

    .line 19
    .line 20
    iput-object p1, p0, Lpz2;->e:Lod2;

    .line 21
    .line 22
    new-instance p1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

    .line 23
    .line 24
    invoke-direct {p1}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lpz2;->f:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

    .line 28
    .line 29
    new-instance p1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 30
    .line 31
    invoke-direct {p1}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lpz2;->g:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    const-string v0, "Clearing local storage"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lpz2;->b:Li03;

    .line 5
    .line 6
    invoke-interface {v2, v0, v1}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lfh2;->a:[Lfh2;

    .line 10
    .line 11
    const-string v0, "location"

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lpz2;->e:Lod2;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v1, v1, Lod2;->a:Landroid/content/SharedPreferences;

    .line 26
    .line 27
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Ljava/lang/String;

    .line 54
    .line 55
    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-interface {v2, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lpz2;->b()V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lpz2;->d:Lod2;

    .line 73
    .line 74
    const-string v1, "IABUSPrivacy_String"

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Lod2;->a(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    new-instance v0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

    .line 80
    .line 81
    invoke-direct {v0}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, Lpz2;->f:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

    .line 85
    .line 86
    new-instance v0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 87
    .line 88
    invoke-direct {v0}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, Lpz2;->g:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 92
    .line 93
    return-void
.end method

.method public final b()V
    .locals 5

    .line 1
    invoke-static {}, Lbv0;->values()[Lbv0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    iget-object v3, p0, Lpz2;->d:Lod2;

    .line 8
    .line 9
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v4, v0, v2

    .line 12
    .line 13
    iget-object v4, v4, Lbv0;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v3, v4}, Lod2;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x1

    .line 22
    :goto_1
    const/16 v0, 0xc

    .line 23
    .line 24
    if-ge p0, v0, :cond_1

    .line 25
    .line 26
    sget-object v0, Lbv0;->Companion:Lav0;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v1, "IABTCF_PublisherRestrictions"

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v3, v0}, Lod2;->a(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 p0, p0, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    return-void
.end method

.method public final c()Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer;
    .locals 3

    .line 1
    invoke-static {}, Ljb1;->h()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lfh2;->a:[Lfh2;

    .line 5
    .line 6
    iget-object p0, p0, Lpz2;->e:Lod2;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lod2;->a:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    const-string v0, "consents_buffer"

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    const-string p0, ""

    .line 23
    .line 24
    :cond_0
    sget-object v0, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer;->Companion:Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer$Companion;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v2, Lb21;->a:Lr11;

    .line 31
    .line 32
    invoke-static {v2, v0, p0, v1}, Lb21;->a(Lb11;Lkotlinx/serialization/KSerializer;Ljava/lang/String;Li03;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer;

    .line 37
    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    new-instance p0, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer;

    .line 41
    .line 42
    sget-object v0, Lnd0;->a:Lnd0;

    .line 43
    .line 44
    invoke-direct {p0, v0}, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer;-><init>(Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-object p0
.end method

.method public final d()Ljava/lang/Long;
    .locals 8

    .line 1
    iget-object p0, p0, Lpz2;->f:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;->d:Ljava/util/List;

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_7

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;

    .line 26
    .line 27
    iget-object v1, v1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;->a:Ljava/util/List;

    .line 28
    .line 29
    new-instance v3, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    move-object v5, v4

    .line 49
    check-cast v5, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;

    .line 50
    .line 51
    iget-object v6, v5, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->a:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 52
    .line 53
    sget-object v7, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->f:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 54
    .line 55
    if-ne v6, v7, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    iget-object v5, v5, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->c:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;

    .line 59
    .line 60
    sget-object v6, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;->c:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;

    .line 61
    .line 62
    if-eq v5, v6, :cond_1

    .line 63
    .line 64
    :goto_2
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-nez v3, :cond_4

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;

    .line 84
    .line 85
    iget-wide v2, v2, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->e:J

    .line 86
    .line 87
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    :cond_5
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_6

    .line 96
    .line 97
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;

    .line 102
    .line 103
    iget-wide v3, v3, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->e:J

    .line 104
    .line 105
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v2, v3}, Ljava/lang/Long;->compareTo(Ljava/lang/Object;)I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-gez v4, :cond_5

    .line 114
    .line 115
    move-object v2, v3

    .line 116
    goto :goto_3

    .line 117
    :cond_6
    :goto_4
    if-eqz v2, :cond_0

    .line 118
    .line 119
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-nez v0, :cond_8

    .line 132
    .line 133
    return-object v2

    .line 134
    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, Ljava/lang/Number;

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 141
    .line 142
    .line 143
    move-result-wide v0

    .line 144
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    :cond_9
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_a

    .line 153
    .line 154
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    check-cast v1, Ljava/lang/Number;

    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 161
    .line 162
    .line 163
    move-result-wide v1

    .line 164
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/Long;->compareTo(Ljava/lang/Object;)I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-gez v2, :cond_9

    .line 173
    .line 174
    move-object v0, v1

    .line 175
    goto :goto_5

    .line 176
    :cond_a
    return-object v0
.end method

.method public final e(II)V
    .locals 4

    .line 1
    iget-object p0, p0, Lpz2;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, Lui1;

    .line 19
    .line 20
    iget v2, v2, Lui1;->b:I

    .line 21
    .line 22
    add-int/lit8 v3, v2, -0x1

    .line 23
    .line 24
    if-ne v3, p1, :cond_0

    .line 25
    .line 26
    if-ne v2, p2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :goto_0
    check-cast v1, Lui1;

    .line 31
    .line 32
    if-eqz v1, :cond_4

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lui1;

    .line 49
    .line 50
    iget v1, v0, Lui1;->b:I

    .line 51
    .line 52
    add-int/lit8 v2, v1, -0x1

    .line 53
    .line 54
    if-ne v2, p1, :cond_2

    .line 55
    .line 56
    if-ne v1, p2, :cond_2

    .line 57
    .line 58
    invoke-virtual {v0}, Lui1;->a()V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    return-void

    .line 63
    :cond_4
    new-instance p0, Lyi1;

    .line 64
    .line 65
    invoke-direct {p0, p1, p2}, Lyi1;-><init>(II)V

    .line 66
    .line 67
    .line 68
    throw p0
.end method

.method public final f()Ljava/util/List;
    .locals 5

    .line 1
    invoke-static {}, Ljb1;->h()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lfh2;->a:[Lfh2;

    .line 5
    .line 6
    iget-object p0, p0, Lpz2;->e:Lod2;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lod2;->a:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    const-string v0, "session_buffer"

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    invoke-static {p0}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object v0, Lb21;->a:Lr11;

    .line 30
    .line 31
    iget-object v1, v0, Lb11;->b:Lb5;

    .line 32
    .line 33
    sget-object v2, Lkotlin/reflect/KTypeProjection;->c:Lw21;

    .line 34
    .line 35
    const-class v3, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSessionEntry;

    .line 36
    .line 37
    invoke-static {v3}, Lj22;->b(Ljava/lang/Class;)Ljs2;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v2, Lkotlin/reflect/KTypeProjection;

    .line 45
    .line 46
    sget-object v4, Ly21;->a:Ly21;

    .line 47
    .line 48
    invoke-direct {v2, v4, v3}, Lkotlin/reflect/KTypeProjection;-><init>(Ly21;Ljs2;)V

    .line 49
    .line 50
    .line 51
    sget-object v3, Lj22;->a:Lk22;

    .line 52
    .line 53
    const-class v4, Ljava/util/List;

    .line 54
    .line 55
    invoke-static {v4}, Lj22;->a(Ljava/lang/Class;)Ldv;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance v3, Ljs2;

    .line 67
    .line 68
    invoke-direct {v3, v4, v2}, Ljs2;-><init>(Ldv;Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v1, v3}, Ljb1;->z(Lb5;Lv21;)Lkotlinx/serialization/KSerializer;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, p0, v1}, Lb11;->a(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, Ljava/util/List;

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_1
    :goto_0
    sget-object p0, Lnd0;->a:Lnd0;

    .line 83
    .line 84
    return-object p0
.end method

.method public final g(Lk61;Ljava/util/List;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lpz2;->f:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

    .line 9
    .line 10
    iget-object v2, v2, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;->e:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v2}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    iget-object v4, v0, Lpz2;->e:Lod2;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v3, v1, Lk61;->h:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v5, v1, Lk61;->k:Ljava/lang/String;

    .line 31
    .line 32
    const/4 v6, 0x1

    .line 33
    new-array v7, v6, [C

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    const/16 v9, 0x2e

    .line 37
    .line 38
    aput-char v9, v7, v8

    .line 39
    .line 40
    invoke-static {v5, v7}, Lkotlin/text/StringsKt;->K(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    new-array v7, v6, [C

    .line 45
    .line 46
    aput-char v9, v7, v8

    .line 47
    .line 48
    invoke-static {v2, v7}, Lkotlin/text/StringsKt;->K(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    sget-object v7, Lqc2;->a:[Lqc2;

    .line 53
    .line 54
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-interface {v3, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    if-eqz v7, :cond_2

    .line 63
    .line 64
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_4

    .line 77
    .line 78
    :cond_2
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-interface {v3, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-eqz v7, :cond_3

    .line 87
    .line 88
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_4

    .line 101
    .line 102
    :cond_3
    const/4 v6, 0x2

    .line 103
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-interface {v3, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_5

    .line 112
    .line 113
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-nez v2, :cond_5

    .line 126
    .line 127
    :cond_4
    sget-object v2, Lfh2;->a:[Lfh2;

    .line 128
    .line 129
    const-string v2, "user_action_required"

    .line 130
    .line 131
    const-string v3, "true"

    .line 132
    .line 133
    invoke-virtual {v4, v2, v3}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :cond_5
    :goto_0
    iget-boolean v2, v1, Lk61;->g:Z

    .line 137
    .line 138
    const/4 v3, 0x0

    .line 139
    if-eqz v2, :cond_7

    .line 140
    .line 141
    iget-object v2, v1, Lk61;->i:Lij;

    .line 142
    .line 143
    if-eqz v2, :cond_6

    .line 144
    .line 145
    iget-object v2, v2, Lij;->d:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, Lcv1;

    .line 148
    .line 149
    iget-object v3, v2, Lcv1;->b:Lbv1;

    .line 150
    .line 151
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_7
    iget-object v2, v1, Lk61;->j:Lec;

    .line 156
    .line 157
    if-eqz v2, :cond_8

    .line 158
    .line 159
    iget-object v2, v2, Lec;->c:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v2, Lcv1;

    .line 162
    .line 163
    iget-object v3, v2, Lcv1;->b:Lbv1;

    .line 164
    .line 165
    :cond_8
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    :goto_1
    new-instance v5, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

    .line 169
    .line 170
    iget-object v6, v1, Lk61;->e:Ljava/lang/String;

    .line 171
    .line 172
    iget-object v7, v1, Lk61;->f:Ljava/lang/String;

    .line 173
    .line 174
    iget-object v8, v3, Lbv1;->a:Ljava/lang/String;

    .line 175
    .line 176
    new-instance v9, Ljava/util/ArrayList;

    .line 177
    .line 178
    const/16 v2, 0xa

    .line 179
    .line 180
    move-object/from16 v3, p2

    .line 181
    .line 182
    invoke-static {v3, v2}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 187
    .line 188
    .line 189
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    if-eqz v10, :cond_a

    .line 198
    .line 199
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    check-cast v10, Lm61;

    .line 204
    .line 205
    iget-object v11, v10, Lm61;->p:Li61;

    .line 206
    .line 207
    iget-object v11, v11, Li61;->a:Ljava/util/List;

    .line 208
    .line 209
    new-instance v12, Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-static {v11, v2}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 212
    .line 213
    .line 214
    move-result v13

    .line 215
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 216
    .line 217
    .line 218
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result v13

    .line 226
    if-eqz v13, :cond_9

    .line 227
    .line 228
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v13

    .line 232
    check-cast v13, Lj61;

    .line 233
    .line 234
    sget-object v14, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->Companion:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory$Companion;

    .line 235
    .line 236
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    new-instance v15, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;

    .line 243
    .line 244
    sget-object v14, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->Companion:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction$Companion;

    .line 245
    .line 246
    iget-object v2, v13, Lj61;->a:Lkz2;

    .line 247
    .line 248
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-static {v2}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction$Companion;->a(Lkz2;)Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 252
    .line 253
    .line 254
    move-result-object v16

    .line 255
    iget-boolean v2, v13, Lj61;->b:Z

    .line 256
    .line 257
    sget-object v14, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;->Companion:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType$Companion;

    .line 258
    .line 259
    move/from16 v17, v2

    .line 260
    .line 261
    iget-object v2, v13, Lj61;->c:Lmz2;

    .line 262
    .line 263
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-static {v2}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType$Companion;->a(Lmz2;)Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;

    .line 267
    .line 268
    .line 269
    move-result-object v18

    .line 270
    iget-object v2, v13, Lj61;->d:Ljava/lang/String;

    .line 271
    .line 272
    iget-wide v13, v13, Lj61;->e:J

    .line 273
    .line 274
    move-object/from16 v19, v2

    .line 275
    .line 276
    move-wide/from16 v20, v13

    .line 277
    .line 278
    invoke-direct/range {v15 .. v21}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;-><init>(Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;ZLcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;Ljava/lang/String;J)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    const/16 v2, 0xa

    .line 285
    .line 286
    goto :goto_3

    .line 287
    :cond_9
    iget-object v2, v10, Lm61;->f:Ljava/lang/String;

    .line 288
    .line 289
    iget-object v11, v10, Lm61;->s:Ljava/lang/String;

    .line 290
    .line 291
    iget-object v10, v10, Lm61;->p:Li61;

    .line 292
    .line 293
    iget-boolean v10, v10, Li61;->b:Z

    .line 294
    .line 295
    new-instance v13, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;

    .line 296
    .line 297
    invoke-direct {v13, v12, v2, v11, v10}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    const/16 v2, 0xa

    .line 304
    .line 305
    goto :goto_2

    .line 306
    :cond_a
    iget-object v10, v1, Lk61;->k:Ljava/lang/String;

    .line 307
    .line 308
    invoke-direct/range {v5 .. v10}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    iput-object v5, v0, Lpz2;->f:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

    .line 312
    .line 313
    sget-object v0, Lfh2;->a:[Lfh2;

    .line 314
    .line 315
    iget-object v0, v1, Lk61;->f:Ljava/lang/String;

    .line 316
    .line 317
    const-string v1, "settings-"

    .line 318
    .line 319
    invoke-static {v1, v0}, Len;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    sget-object v1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;->Companion:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings$Companion;

    .line 324
    .line 325
    invoke-virtual {v1}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    sget-object v2, Lb21;->a:Lr11;

    .line 330
    .line 331
    invoke-virtual {v2, v1, v5}, Lb11;->b(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-virtual {v4, v0, v1}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    return-void
.end method

.method public final h(Ljava/util/Map;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lpz2;->d:Lod2;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lod2;->a:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/util/Map$Entry;

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    instance-of v2, v1, Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Ljava/lang/String;

    .line 48
    .line 49
    check-cast v1, Ljava/lang/String;

    .line 50
    .line 51
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    instance-of v2, v1, Ljava/lang/Integer;

    .line 56
    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Ljava/lang/String;

    .line 64
    .line 65
    check-cast v1, Ljava/lang/Number;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final i(Ljava/util/Set;)V
    .locals 5

    .line 1
    sget-object v0, Lfh2;->a:[Lfh2;

    .line 2
    .line 3
    sget-object v0, Lb21;->a:Lr11;

    .line 4
    .line 5
    iget-object v1, v0, Lb11;->b:Lb5;

    .line 6
    .line 7
    sget-object v2, Lkotlin/reflect/KTypeProjection;->c:Lw21;

    .line 8
    .line 9
    const-class v3, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSessionEntry;

    .line 10
    .line 11
    invoke-static {v3}, Lj22;->b(Ljava/lang/Class;)Ljs2;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v2, Lkotlin/reflect/KTypeProjection;

    .line 19
    .line 20
    sget-object v4, Ly21;->a:Ly21;

    .line 21
    .line 22
    invoke-direct {v2, v4, v3}, Lkotlin/reflect/KTypeProjection;-><init>(Ly21;Ljs2;)V

    .line 23
    .line 24
    .line 25
    sget-object v3, Lj22;->a:Lk22;

    .line 26
    .line 27
    const-class v4, Ljava/util/Set;

    .line 28
    .line 29
    invoke-static {v4}, Lj22;->a(Ljava/lang/Class;)Ldv;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v3, Ljs2;

    .line 41
    .line 42
    invoke-direct {v3, v4, v2}, Ljs2;-><init>(Ldv;Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v3}, Ljb1;->z(Lb5;Lv21;)Lkotlinx/serialization/KSerializer;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1, p1}, Lb11;->b(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object p0, p0, Lpz2;->e:Lod2;

    .line 54
    .line 55
    const-string v0, "session_buffer"

    .line 56
    .line 57
    invoke-virtual {p0, v0, p1}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method
