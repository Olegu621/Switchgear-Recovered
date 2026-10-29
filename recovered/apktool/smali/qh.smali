.class public final Lqh;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lc10;I)V
    .locals 0

    .line 12
    iput p3, p0, Lqh;->a:I

    iput-object p1, p0, Lqh;->c:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ltj2;-><init>(ILc10;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V
    .locals 0

    .line 1
    iput p4, p0, Lqh;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lqh;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lqh;->c:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Ltj2;-><init>(ILc10;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lqh;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lmz;

    .line 9
    .line 10
    iget-object p0, p0, Lqh;->c:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v4, p0

    .line 13
    check-cast v4, Lkz2;

    .line 14
    .line 15
    iget-object p0, p1, Lmz;->f:Lac2;

    .line 16
    .line 17
    sget-object v0, Lkz2;->v:Lkz2;

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    if-ne v4, v0, :cond_4

    .line 21
    .line 22
    sget-object v0, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;->Companion:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$Companion;

    .line 23
    .line 24
    invoke-virtual {p1}, Lmz;->b()Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object p0, p0, Lac2;->c:Lk61;

    .line 29
    .line 30
    iget-object v2, p0, Lk61;->e:Ljava/lang/String;

    .line 31
    .line 32
    sget-object v3, Lnd0;->a:Lnd0;

    .line 33
    .line 34
    invoke-virtual {v4}, Lkz2;->a()Lmz2;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-static/range {v0 .. v5}, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$Companion;->a(Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$Companion;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Ljava/lang/String;Ljava/util/List;Lkz2;Lmz2;)Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    iget-object v0, p1, Lmz;->d:Lg80;

    .line 43
    .line 44
    check-cast v0, Lpz2;

    .line 45
    .line 46
    iget-object v1, v0, Lpz2;->d:Lod2;

    .line 47
    .line 48
    sget-object v2, Lbv0;->Companion:Lav0;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object v1, v1, Lod2;->a:Landroid/content/SharedPreferences;

    .line 54
    .line 55
    const-string v2, "IABTCF_AddtlConsent"

    .line 56
    .line 57
    invoke-interface {v1, v2, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const-string v2, ""

    .line 62
    .line 63
    if-nez v1, :cond_0

    .line 64
    .line 65
    move-object v1, v2

    .line 66
    :cond_0
    new-instance v3, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;

    .line 67
    .line 68
    iget-object v4, v0, Lpz2;->g:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 69
    .line 70
    iget-object v5, v4, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;->a:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v5}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-nez v7, :cond_1

    .line 77
    .line 78
    new-instance v6, Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;

    .line 79
    .line 80
    iget-object v0, v4, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;->b:Ljava/util/Map;

    .line 81
    .line 82
    invoke-direct {v6, v5, v0}, Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    iget-object v0, v0, Lpz2;->d:Lod2;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    iget-object v0, v0, Lod2;->a:Landroid/content/SharedPreferences;

    .line 92
    .line 93
    const-string v4, "IABUSPrivacy_String"

    .line 94
    .line 95
    invoke-interface {v0, v4, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-nez v0, :cond_2

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    move-object v2, v0

    .line 103
    :goto_0
    invoke-static {v2}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_3

    .line 108
    .line 109
    new-instance v6, Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;

    .line 110
    .line 111
    sget-object v0, Lod0;->a:Lod0;

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-direct {v6, v2, v0}, Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 117
    .line 118
    .line 119
    :cond_3
    :goto_1
    invoke-direct {v3, p0, v6, v1}, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;-><init>(Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    sget-object v0, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;->Companion:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$Companion;

    .line 124
    .line 125
    invoke-virtual {p1}, Lmz;->b()Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    iget-object p0, p0, Lac2;->c:Lk61;

    .line 130
    .line 131
    iget-object v2, p0, Lk61;->e:Ljava/lang/String;

    .line 132
    .line 133
    iget-object v3, p0, Lk61;->b:Ljava/util/List;

    .line 134
    .line 135
    invoke-virtual {v4}, Lkz2;->a()Lmz2;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-static/range {v0 .. v5}, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$Companion;->a(Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$Companion;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Ljava/lang/String;Ljava/util/List;Lkz2;Lmz2;)Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    new-instance v3, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;

    .line 144
    .line 145
    invoke-direct {v3, p0, v6, v6}, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;-><init>(Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :goto_2
    invoke-static {p1, v3}, Lmz;->a(Lmz;Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;)V

    .line 149
    .line 150
    .line 151
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    return-object p0
.end method

.method private final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lqh;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lj10;

    .line 9
    .line 10
    iget-object v0, p1, Lj10;->b:Lgl2;

    .line 11
    .line 12
    iget-object v1, v0, Lgl2;->c:Lcom/usercentrics/tcf/core/model/gvl/VendorList;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v0, v0, Lgl2;->d:Lcom/usercentrics/tcf/core/model/gvl/Declarations;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, v0, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->a:Ljava/util/Map;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, v1, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->f:Ljava/util/Map;

    .line 25
    .line 26
    :goto_0
    iget-object v1, p1, Lj10;->c:Lgr0;

    .line 27
    .line 28
    iget-object p0, p0, Lqh;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v1, v1, Lgr0;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Ld52;

    .line 38
    .line 39
    iget-object v1, v1, Ld52;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Lxu0;

    .line 42
    .line 43
    invoke-virtual {v1, p0}, Lxu0;->b(Ljava/lang/String;)Lzu0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iget-object p0, p0, Lzu0;->b:Ljava/lang/String;

    .line 48
    .line 49
    sget-object v1, Lb21;->a:Lr11;

    .line 50
    .line 51
    iget-object v2, v1, Lb11;->b:Lb5;

    .line 52
    .line 53
    const-class v3, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;

    .line 54
    .line 55
    invoke-static {v3}, Lj22;->b(Ljava/lang/Class;)Ljs2;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-static {v2, v3}, Ljb1;->z(Lb5;Lv21;)Lkotlinx/serialization/KSerializer;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v1, p0, v2}, Lb11;->a(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;

    .line 68
    .line 69
    new-instance v1, Lec;

    .line 70
    .line 71
    invoke-virtual {p1}, Lj10;->b()Lhu1;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    if-nez v0, :cond_1

    .line 79
    .line 80
    sget-object v0, Lod0;->a:Lod0;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    :cond_1
    invoke-direct {v1, p0, p1, v0}, Lec;-><init>(Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;Lhu1;Ljava/util/Map;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Lec;->E()Ljava/util/ArrayList;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lqh;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lxu0;

    .line 9
    .line 10
    iget-object p0, p0, Lqh;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Lxu0;->b(Ljava/lang/String;)Lzu0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method private final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lqh;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ly10;

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    throw p0
.end method

.method private final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lqh;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 9
    .line 10
    invoke-static {p1}, Lcom/supercell/id/scid_plugin/MobileScanner;->access$getMobileScannerCallback$p(Lcom/supercell/id/scid_plugin/MobileScanner;)Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object p0, p0, Lqh;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0
.end method

.method private final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lqh;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lfj1;

    .line 9
    .line 10
    iget-object p1, p1, Lfj1;->d:Lgj1;

    .line 11
    .line 12
    iget-object p0, p0, Lqh;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p0}, Lgj1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0
.end method

.method private final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lqh;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 9
    .line 10
    invoke-static {p1}, Lcom/supercell/id/scid_plugin/MobileScanner;->access$getMobileScannerErrorCallback$p(Lcom/supercell/id/scid_plugin/MobileScanner;)Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object p0, p0, Lqh;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/lang/Exception;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0
.end method

.method private final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lqh;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lfj1;

    .line 9
    .line 10
    iget-object p1, p1, Lfj1;->e:Lgj1;

    .line 11
    .line 12
    iget-object p0, p0, Lqh;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ljava/lang/Exception;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    invoke-virtual {p1, v0}, Lgj1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0
.end method

.method private final n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lqh;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lqh;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;

    .line 20
    .line 21
    invoke-static {p0}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;->access$getEncryptedStorage$p(Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;)Lcom/supercell/id/scid_plugin/EncryptedStorage;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    const-string v0, "whitelist"

    .line 28
    .line 29
    invoke-virtual {p0, v0, p1}, Lcom/supercell/id/scid_plugin/EncryptedStorage;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 2

    .line 1
    iget v0, p0, Lqh;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lqh;->c:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Lqh;

    .line 9
    .line 10
    iget-object p0, p0, Lqh;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 13
    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    const/16 v0, 0xb

    .line 17
    .line 18
    invoke-direct {p1, p0, v1, p2, v0}, Lqh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_0
    new-instance p1, Lqh;

    .line 23
    .line 24
    iget-object p0, p0, Lqh;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lorg/json/JSONObject;

    .line 27
    .line 28
    check-cast v1, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;

    .line 29
    .line 30
    const/16 v0, 0xa

    .line 31
    .line 32
    invoke-direct {p1, p0, v1, p2, v0}, Lqh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_1
    new-instance p1, Lqh;

    .line 37
    .line 38
    iget-object p0, p0, Lqh;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 41
    .line 42
    check-cast v1, Ljava/lang/Exception;

    .line 43
    .line 44
    const/16 v0, 0x9

    .line 45
    .line 46
    invoke-direct {p1, p0, v1, p2, v0}, Lqh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :pswitch_2
    new-instance p1, Lqh;

    .line 51
    .line 52
    iget-object p0, p0, Lqh;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, Lfj1;

    .line 55
    .line 56
    check-cast v1, Ljava/lang/Exception;

    .line 57
    .line 58
    const/16 v0, 0x8

    .line 59
    .line 60
    invoke-direct {p1, p0, v1, p2, v0}, Lqh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 61
    .line 62
    .line 63
    return-object p1

    .line 64
    :pswitch_3
    new-instance p1, Lqh;

    .line 65
    .line 66
    iget-object p0, p0, Lqh;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 69
    .line 70
    check-cast v1, Ljava/lang/String;

    .line 71
    .line 72
    const/4 v0, 0x7

    .line 73
    invoke-direct {p1, p0, v1, p2, v0}, Lqh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 74
    .line 75
    .line 76
    return-object p1

    .line 77
    :pswitch_4
    new-instance p1, Lqh;

    .line 78
    .line 79
    iget-object p0, p0, Lqh;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p0, Lfj1;

    .line 82
    .line 83
    check-cast v1, Ljava/lang/String;

    .line 84
    .line 85
    const/4 v0, 0x6

    .line 86
    invoke-direct {p1, p0, v1, p2, v0}, Lqh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 87
    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_5
    new-instance p0, Lqh;

    .line 91
    .line 92
    check-cast v1, Lrd1;

    .line 93
    .line 94
    const/4 v0, 0x5

    .line 95
    invoke-direct {p0, v1, p2, v0}, Lqh;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 96
    .line 97
    .line 98
    iput-object p1, p0, Lqh;->b:Ljava/lang/Object;

    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_6
    new-instance p1, Lqh;

    .line 102
    .line 103
    iget-object p0, p0, Lqh;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p0, Lxu0;

    .line 106
    .line 107
    check-cast v1, Ljava/lang/String;

    .line 108
    .line 109
    const/4 v0, 0x4

    .line 110
    invoke-direct {p1, p0, v1, p2, v0}, Lqh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 111
    .line 112
    .line 113
    return-object p1

    .line 114
    :pswitch_7
    new-instance p0, Lqh;

    .line 115
    .line 116
    check-cast v1, Log2;

    .line 117
    .line 118
    const/4 v0, 0x3

    .line 119
    invoke-direct {p0, v1, p2, v0}, Lqh;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 120
    .line 121
    .line 122
    iput-object p1, p0, Lqh;->b:Ljava/lang/Object;

    .line 123
    .line 124
    return-object p0

    .line 125
    :pswitch_8
    new-instance p1, Lqh;

    .line 126
    .line 127
    iget-object p0, p0, Lqh;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p0, Lj10;

    .line 130
    .line 131
    check-cast v1, Ljava/lang/String;

    .line 132
    .line 133
    const/4 v0, 0x2

    .line 134
    invoke-direct {p1, p0, v1, p2, v0}, Lqh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 135
    .line 136
    .line 137
    return-object p1

    .line 138
    :pswitch_9
    new-instance p1, Lqh;

    .line 139
    .line 140
    iget-object p0, p0, Lqh;->b:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p0, Lmz;

    .line 143
    .line 144
    check-cast v1, Lkz2;

    .line 145
    .line 146
    const/4 v0, 0x1

    .line 147
    invoke-direct {p1, p0, v1, p2, v0}, Lqh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 148
    .line 149
    .line 150
    return-object p1

    .line 151
    :pswitch_a
    new-instance p1, Lqh;

    .line 152
    .line 153
    iget-object p0, p0, Lqh;->b:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast p0, Lth;

    .line 156
    .line 157
    check-cast v1, Lk61;

    .line 158
    .line 159
    const/4 v0, 0x0

    .line 160
    invoke-direct {p1, p0, v1, p2, v0}, Lqh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 161
    .line 162
    .line 163
    return-object p1

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lqh;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ly10;

    .line 7
    .line 8
    check-cast p2, Lc10;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lqh;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lqh;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lqh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ly10;

    .line 24
    .line 25
    check-cast p2, Lc10;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lqh;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lqh;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lqh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ly10;

    .line 41
    .line 42
    check-cast p2, Lc10;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Lqh;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Lqh;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lqh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, Ly10;

    .line 58
    .line 59
    check-cast p2, Lc10;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, Lqh;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Lqh;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lqh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, Ly10;

    .line 75
    .line 76
    check-cast p2, Lc10;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, Lqh;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, Lqh;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Lqh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, Ly10;

    .line 92
    .line 93
    check-cast p2, Lc10;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, Lqh;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, Lqh;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, Lqh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, Ly10;

    .line 109
    .line 110
    check-cast p2, Lc10;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, Lqh;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, Lqh;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, Lqh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    const/4 p0, 0x0

    .line 124
    throw p0

    .line 125
    :pswitch_6
    check-cast p1, Ly80;

    .line 126
    .line 127
    check-cast p2, Lc10;

    .line 128
    .line 129
    invoke-virtual {p0, p1, p2}, Lqh;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, Lqh;

    .line 134
    .line 135
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    invoke-virtual {p0, p1}, Lqh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :pswitch_7
    check-cast p1, Log2;

    .line 143
    .line 144
    check-cast p2, Lc10;

    .line 145
    .line 146
    invoke-virtual {p0, p1, p2}, Lqh;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    check-cast p0, Lqh;

    .line 151
    .line 152
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    invoke-virtual {p0, p1}, Lqh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :pswitch_8
    check-cast p1, Ly80;

    .line 160
    .line 161
    check-cast p2, Lc10;

    .line 162
    .line 163
    invoke-virtual {p0, p1, p2}, Lqh;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    check-cast p0, Lqh;

    .line 168
    .line 169
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    invoke-virtual {p0, p1}, Lqh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    return-object p0

    .line 176
    :pswitch_9
    check-cast p1, Ly80;

    .line 177
    .line 178
    check-cast p2, Lc10;

    .line 179
    .line 180
    invoke-virtual {p0, p1, p2}, Lqh;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    check-cast p0, Lqh;

    .line 185
    .line 186
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    invoke-virtual {p0, p1}, Lqh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    return-object p0

    .line 193
    :pswitch_a
    check-cast p1, Ly80;

    .line 194
    .line 195
    check-cast p2, Lc10;

    .line 196
    .line 197
    invoke-virtual {p0, p1, p2}, Lqh;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast p0, Lqh;

    .line 202
    .line 203
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    invoke-virtual {p0, p1}, Lqh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    return-object p0

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 72

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lqh;->a:I

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, v0, Lqh;->c:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, Lz10;->a:Lz10;

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lqh;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/usercentrics/sdk/ui/components/UCImageView;->c(Lcom/usercentrics/sdk/ui/components/UCImageView;)Lfv2;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v4, Ljava/lang/String;

    .line 25
    .line 26
    check-cast v0, Lhv2;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v0, Ljava/net/URL;

    .line 35
    .line 36
    invoke-direct {v0, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-object v1, v0

    .line 47
    check-cast v1, Ljava/net/HttpURLConnection;

    .line 48
    .line 49
    const-string v0, "GET"

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/16 v0, 0x2710

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 57
    .line 58
    .line 59
    :try_start_0
    invoke-virtual {v1}, Ljava/net/URLConnection;->connect()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {v2}, Lb40;->A(Ljava/io/InputStream;)[B

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    new-instance v3, Lev2;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-direct {v3, v2, v0}, Lev2;-><init>([BLjava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 83
    .line 84
    .line 85
    :try_start_1
    sget-object v0, Lo42;->b:Lm42;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :catchall_0
    sget-object v0, Lo42;->b:Lm42;

    .line 96
    .line 97
    :goto_0
    :try_start_2
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :catchall_1
    sget-object v0, Lo42;->b:Lm42;

    .line 102
    .line 103
    :goto_1
    return-object v3

    .line 104
    :catchall_2
    move-exception v0

    .line 105
    :try_start_3
    sget-object v2, Lo42;->b:Lm42;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :catchall_3
    sget-object v2, Lo42;->b:Lm42;

    .line 116
    .line 117
    :goto_2
    :try_start_4
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :catchall_4
    sget-object v1, Lo42;->b:Lm42;

    .line 122
    .line 123
    :goto_3
    throw v0

    .line 124
    :pswitch_0
    invoke-direct/range {p0 .. p1}, Lqh;->n(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    return-object v0

    .line 129
    :pswitch_1
    invoke-direct/range {p0 .. p1}, Lqh;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    return-object v0

    .line 134
    :pswitch_2
    invoke-direct/range {p0 .. p1}, Lqh;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    return-object v0

    .line 139
    :pswitch_3
    invoke-direct/range {p0 .. p1}, Lqh;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    return-object v0

    .line 144
    :pswitch_4
    invoke-direct/range {p0 .. p1}, Lqh;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    return-object v0

    .line 149
    :pswitch_5
    invoke-direct/range {p0 .. p1}, Lqh;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    return-object v0

    .line 154
    :pswitch_6
    invoke-direct/range {p0 .. p1}, Lqh;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    return-object v0

    .line 159
    :pswitch_7
    sget-object v1, Lz10;->a:Lz10;

    .line 160
    .line 161
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    iget-object v0, v0, Lqh;->b:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v0, Log2;

    .line 167
    .line 168
    instance-of v1, v0, Lx30;

    .line 169
    .line 170
    if-eqz v1, :cond_0

    .line 171
    .line 172
    iget v0, v0, Log2;->a:I

    .line 173
    .line 174
    check-cast v4, Log2;

    .line 175
    .line 176
    iget v1, v4, Log2;->a:I

    .line 177
    .line 178
    if-gt v0, v1, :cond_0

    .line 179
    .line 180
    move v2, v3

    .line 181
    goto :goto_4

    .line 182
    :cond_0
    const/4 v2, 0x0

    .line 183
    :goto_4
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    return-object v0

    .line 188
    :pswitch_8
    invoke-direct/range {p0 .. p1}, Lqh;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    return-object v0

    .line 193
    :pswitch_9
    invoke-direct/range {p0 .. p1}, Lqh;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    return-object v0

    .line 198
    :pswitch_a
    check-cast v4, Lk61;

    .line 199
    .line 200
    sget-object v1, Lz10;->a:Lz10;

    .line 201
    .line 202
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    iget-object v0, v0, Lqh;->b:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, Lth;

    .line 208
    .line 209
    iget-object v1, v0, Lth;->c:Lsr2;

    .line 210
    .line 211
    iget-object v5, v0, Lth;->a:Lpc2;

    .line 212
    .line 213
    iget-object v6, v0, Lth;->b:Lac2;

    .line 214
    .line 215
    iget-object v7, v0, Lth;->g:Lg13;

    .line 216
    .line 217
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 218
    .line 219
    .line 220
    move-result v7

    .line 221
    if-eqz v7, :cond_7b

    .line 222
    .line 223
    if-eq v7, v3, :cond_79

    .line 224
    .line 225
    const/4 v8, 0x2

    .line 226
    const/4 v9, 0x0

    .line 227
    if-ne v7, v8, :cond_78

    .line 228
    .line 229
    iget-object v7, v0, Lth;->d:Lil2;

    .line 230
    .line 231
    check-cast v7, Lqk2;

    .line 232
    .line 233
    invoke-virtual {v7}, Lqk2;->i()Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 234
    .line 235
    .line 236
    move-result-object v12

    .line 237
    iget-object v6, v6, Lac2;->c:Lk61;

    .line 238
    .line 239
    iget-object v5, v5, Lpc2;->d:Lkn1;

    .line 240
    .line 241
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    iget-object v11, v5, Lkn1;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 245
    .line 246
    iget-object v1, v1, Lsr2;->b:Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    iget-object v5, v4, Lk61;->i:Lij;

    .line 252
    .line 253
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    iget-object v5, v5, Lij;->c:Ljava/lang/Object;

    .line 257
    .line 258
    move-object v14, v5

    .line 259
    check-cast v14, Lur3;

    .line 260
    .line 261
    iget-object v15, v6, Lk61;->a:Ljava/util/List;

    .line 262
    .line 263
    iget-object v5, v6, Lk61;->b:Ljava/util/List;

    .line 264
    .line 265
    iget-object v6, v4, Lk61;->i:Lij;

    .line 266
    .line 267
    iget-object v6, v6, Lij;->e:Ljava/lang/Object;

    .line 268
    .line 269
    move-object/from16 v17, v6

    .line 270
    .line 271
    check-cast v17, Lac1;

    .line 272
    .line 273
    iget-object v4, v4, Lk61;->e:Ljava/lang/String;

    .line 274
    .line 275
    iget-object v0, v0, Lth;->f:Ly3;

    .line 276
    .line 277
    iget-object v0, v0, Ly3;->d:Ljava/util/List;

    .line 278
    .line 279
    if-nez v0, :cond_1

    .line 280
    .line 281
    sget-object v0, Lnd0;->a:Lnd0;

    .line 282
    .line 283
    :cond_1
    move-object/from16 v19, v0

    .line 284
    .line 285
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    iget-object v0, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 289
    .line 290
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    new-instance v10, Lbl2;

    .line 303
    .line 304
    move-object v13, v14

    .line 305
    move-object v14, v15

    .line 306
    move-object v15, v5

    .line 307
    invoke-direct/range {v10 .. v15}, Lbl2;-><init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;Lur3;Ljava/util/List;Ljava/util/List;)V

    .line 308
    .line 309
    .line 310
    move-object v5, v10

    .line 311
    move-object/from16 v16, v15

    .line 312
    .line 313
    move-object v15, v14

    .line 314
    move-object v14, v13

    .line 315
    new-instance v10, Ldl2;

    .line 316
    .line 317
    move-object v13, v1

    .line 318
    move-object/from16 v18, v4

    .line 319
    .line 320
    invoke-direct/range {v10 .. v19}, Ldl2;-><init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;Lur3;Ljava/util/List;Ljava/util/List;Lac1;Ljava/lang/String;Ljava/util/List;)V

    .line 321
    .line 322
    .line 323
    move-object/from16 v6, v17

    .line 324
    .line 325
    new-instance v1, Ldw1;

    .line 326
    .line 327
    new-instance v4, Lec0;

    .line 328
    .line 329
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    iget-object v7, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->q:Ljava/lang/String;

    .line 333
    .line 334
    iget-object v8, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->r:Ljava/lang/String;

    .line 335
    .line 336
    iget-object v13, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->t:Ljava/lang/String;

    .line 337
    .line 338
    iget-object v15, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->s:Ljava/lang/String;

    .line 339
    .line 340
    invoke-direct {v4, v7, v8, v13, v15}, Lec0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    new-instance v7, Lra2;

    .line 344
    .line 345
    iget-object v6, v6, Lac1;->c:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v6, Lec;

    .line 348
    .line 349
    iget-object v8, v6, Lec;->b:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v8, Leq2;

    .line 352
    .line 353
    iget-object v13, v6, Lec;->c:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v13, Lnv1;

    .line 356
    .line 357
    iget-object v6, v6, Lec;->d:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v6, Lau1;

    .line 360
    .line 361
    invoke-direct {v7, v8, v13, v4, v6}, Lra2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    new-instance v4, Ljw2;

    .line 365
    .line 366
    if-eqz v0, :cond_2

    .line 367
    .line 368
    iget-object v6, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->x:Lfj0;

    .line 369
    .line 370
    if-nez v6, :cond_3

    .line 371
    .line 372
    :cond_2
    sget-object v6, Ljw2;->Companion:Liw2;

    .line 373
    .line 374
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    sget-object v6, Ljw2;->e:Lfj0;

    .line 378
    .line 379
    :cond_3
    iget-object v8, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 380
    .line 381
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    iget-object v13, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->t:Ljava/lang/String;

    .line 385
    .line 386
    iget-object v15, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->a:Ljava/lang/String;

    .line 387
    .line 388
    invoke-virtual {v5}, Lbl2;->a()Z

    .line 389
    .line 390
    .line 391
    move-result v16

    .line 392
    if-nez v16, :cond_4

    .line 393
    .line 394
    sget-object v16, Lev1;->Companion:Ldv1;

    .line 395
    .line 396
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    new-instance v3, Lev1;

    .line 403
    .line 404
    sget-object v2, Lfv1;->c:Lfv1;

    .line 405
    .line 406
    move-object/from16 v16, v15

    .line 407
    .line 408
    sget-object v15, Lez2;->U:Lez2;

    .line 409
    .line 410
    invoke-direct {v3, v13, v9, v2, v15}, Lev1;-><init>(Ljava/lang/String;Ljava/lang/String;Lfv1;Lez2;)V

    .line 411
    .line 412
    .line 413
    goto :goto_5

    .line 414
    :cond_4
    move-object/from16 v16, v15

    .line 415
    .line 416
    move-object v3, v9

    .line 417
    :goto_5
    new-instance v2, Lev1;

    .line 418
    .line 419
    iget-object v15, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->u:Ljava/lang/String;

    .line 420
    .line 421
    move-object/from16 p0, v13

    .line 422
    .line 423
    sget-object v13, Lfv1;->d:Lfv1;

    .line 424
    .line 425
    move-object/from16 p1, v1

    .line 426
    .line 427
    sget-object v1, Lez2;->U:Lez2;

    .line 428
    .line 429
    invoke-direct {v2, v15, v9, v13, v1}, Lev1;-><init>(Ljava/lang/String;Ljava/lang/String;Lfv1;Lez2;)V

    .line 430
    .line 431
    .line 432
    sget-object v1, Lev1;->Companion:Ldv1;

    .line 433
    .line 434
    iget-object v13, v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->D:Ljava/lang/String;

    .line 435
    .line 436
    iget-object v15, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->f:Ljava/lang/String;

    .line 437
    .line 438
    sget-object v9, Lez2;->V:Lez2;

    .line 439
    .line 440
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    invoke-static {v13, v15, v9}, Ldv1;->a(Ljava/lang/String;Ljava/lang/String;Lez2;)Lev1;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    iget-object v9, v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->C:Ljava/lang/String;

    .line 448
    .line 449
    iget-object v13, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->e:Ljava/lang/String;

    .line 450
    .line 451
    sget-object v15, Lez2;->w:Lez2;

    .line 452
    .line 453
    invoke-static {v9, v13, v15}, Ldv1;->a(Ljava/lang/String;Ljava/lang/String;Lez2;)Lev1;

    .line 454
    .line 455
    .line 456
    move-result-object v9

    .line 457
    filled-new-array {v1, v9, v3, v2}, [Lev1;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    invoke-static {v1}, Lqd;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    new-instance v2, Ljava/util/ArrayList;

    .line 466
    .line 467
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    :cond_5
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 475
    .line 476
    .line 477
    move-result v3

    .line 478
    if-eqz v3, :cond_6

    .line 479
    .line 480
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v3

    .line 484
    move-object v9, v3

    .line 485
    check-cast v9, Lev1;

    .line 486
    .line 487
    invoke-virtual {v9}, Lev1;->a()Z

    .line 488
    .line 489
    .line 490
    move-result v9

    .line 491
    if-nez v9, :cond_5

    .line 492
    .line 493
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    goto :goto_6

    .line 497
    :cond_6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 498
    .line 499
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 500
    .line 501
    .line 502
    iget v3, v12, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->h:I

    .line 503
    .line 504
    iget-object v9, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->a0:Ljava/lang/String;

    .line 505
    .line 506
    if-eqz v9, :cond_7

    .line 507
    .line 508
    invoke-static {v9}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 509
    .line 510
    .line 511
    move-result-object v9

    .line 512
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v9

    .line 516
    if-eqz v9, :cond_7

    .line 517
    .line 518
    invoke-static {v9}, Lhu0;->V(Ljava/lang/String;)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v9

    .line 522
    if-eqz v9, :cond_7

    .line 523
    .line 524
    const-string v13, "%VENDOR_COUNT%"

    .line 525
    .line 526
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v3

    .line 530
    invoke-static {v9, v13, v3}, Lkotlin/text/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    :cond_7
    iget-object v3, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->b0:Ljava/lang/String;

    .line 538
    .line 539
    const-string v9, " "

    .line 540
    .line 541
    if-eqz v3, :cond_9

    .line 542
    .line 543
    invoke-static {v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 544
    .line 545
    .line 546
    move-result-object v3

    .line 547
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v3

    .line 551
    if-eqz v3, :cond_9

    .line 552
    .line 553
    invoke-static {v3}, Lhu0;->V(Ljava/lang/String;)Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v3

    .line 557
    if-eqz v3, :cond_9

    .line 558
    .line 559
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 560
    .line 561
    .line 562
    move-result v13

    .line 563
    if-lez v13, :cond_8

    .line 564
    .line 565
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    :cond_8
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    :cond_9
    iget-object v3, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->d0:Ljava/lang/String;

    .line 572
    .line 573
    if-eqz v3, :cond_b

    .line 574
    .line 575
    invoke-static {v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 576
    .line 577
    .line 578
    move-result-object v3

    .line 579
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v3

    .line 583
    if-eqz v3, :cond_b

    .line 584
    .line 585
    invoke-static {v3}, Lhu0;->V(Ljava/lang/String;)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v3

    .line 589
    if-eqz v3, :cond_b

    .line 590
    .line 591
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 592
    .line 593
    .line 594
    move-result v13

    .line 595
    if-lez v13, :cond_a

    .line 596
    .line 597
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    :cond_a
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 601
    .line 602
    .line 603
    :cond_b
    iget-object v3, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->J:Ljava/lang/String;

    .line 604
    .line 605
    const-string v9, ""

    .line 606
    .line 607
    if-eqz v3, :cond_c

    .line 608
    .line 609
    invoke-static {v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 610
    .line 611
    .line 612
    move-result-object v3

    .line 613
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v3

    .line 617
    if-nez v3, :cond_d

    .line 618
    .line 619
    :cond_c
    move-object v3, v9

    .line 620
    :cond_d
    iget-boolean v13, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->I:Z

    .line 621
    .line 622
    if-eqz v13, :cond_f

    .line 623
    .line 624
    invoke-static {v3}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 625
    .line 626
    .line 627
    move-result v13

    .line 628
    if-nez v13, :cond_f

    .line 629
    .line 630
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 631
    .line 632
    .line 633
    move-result v13

    .line 634
    if-lez v13, :cond_e

    .line 635
    .line 636
    const-string v13, "<br><br>"

    .line 637
    .line 638
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 639
    .line 640
    .line 641
    :cond_e
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    :cond_f
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v18

    .line 648
    iget-object v1, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->v:Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;

    .line 649
    .line 650
    if-eqz v1, :cond_11

    .line 651
    .line 652
    iget-object v3, v1, Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;->b:Lej0;

    .line 653
    .line 654
    if-nez v3, :cond_10

    .line 655
    .line 656
    goto :goto_8

    .line 657
    :cond_10
    :goto_7
    move-object/from16 v20, v3

    .line 658
    .line 659
    goto :goto_9

    .line 660
    :cond_11
    :goto_8
    sget-object v3, Lbl2;->i:Lej0;

    .line 661
    .line 662
    goto :goto_7

    .line 663
    :goto_9
    iget-object v3, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->u:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;

    .line 664
    .line 665
    if-eqz v3, :cond_12

    .line 666
    .line 667
    iget-object v3, v3, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;->a:Ljava/lang/String;

    .line 668
    .line 669
    move-object/from16 v21, v3

    .line 670
    .line 671
    goto :goto_a

    .line 672
    :cond_12
    const/16 v21, 0x0

    .line 673
    .line 674
    :goto_a
    if-eqz v1, :cond_13

    .line 675
    .line 676
    iget-object v1, v1, Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;->d:Ldj0;

    .line 677
    .line 678
    if-eqz v1, :cond_13

    .line 679
    .line 680
    sget-object v3, Ldj0;->b:Ldj0;

    .line 681
    .line 682
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    move-result v1

    .line 686
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    move-object/from16 v23, v1

    .line 691
    .line 692
    goto :goto_b

    .line 693
    :cond_13
    const/16 v23, 0x0

    .line 694
    .line 695
    :goto_b
    iget-object v1, v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->h0:Ljava/lang/String;

    .line 696
    .line 697
    new-instance v15, Lf31;

    .line 698
    .line 699
    const/16 v17, 0x0

    .line 700
    .line 701
    const/16 v22, 0x0

    .line 702
    .line 703
    move-object/from16 v24, v1

    .line 704
    .line 705
    move-object/from16 v19, v2

    .line 706
    .line 707
    invoke-direct/range {v15 .. v24}, Lf31;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lej0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    .line 708
    .line 709
    .line 710
    iget-object v1, v5, Lbl2;->c:Lur3;

    .line 711
    .line 712
    iget-object v2, v1, Lur3;->b:Ljava/lang/Object;

    .line 713
    .line 714
    check-cast v2, Lju1;

    .line 715
    .line 716
    invoke-virtual {v5}, Lbl2;->a()Z

    .line 717
    .line 718
    .line 719
    move-result v3

    .line 720
    if-eqz v3, :cond_15

    .line 721
    .line 722
    if-nez p0, :cond_14

    .line 723
    .line 724
    move-object v13, v9

    .line 725
    goto :goto_c

    .line 726
    :cond_14
    move-object/from16 v13, p0

    .line 727
    .line 728
    :goto_c
    iget-object v3, v2, Lju1;->f:Lbx0;

    .line 729
    .line 730
    sget-object v8, Lbu1;->e:Lbu1;

    .line 731
    .line 732
    move-object/from16 p0, v7

    .line 733
    .line 734
    new-instance v7, Luu1;

    .line 735
    .line 736
    invoke-direct {v7, v13, v8, v3}, Luu1;-><init>(Ljava/lang/String;Lbu1;Lbx0;)V

    .line 737
    .line 738
    .line 739
    move-object/from16 v21, v7

    .line 740
    .line 741
    goto :goto_d

    .line 742
    :cond_15
    move-object/from16 p0, v7

    .line 743
    .line 744
    const/16 v21, 0x0

    .line 745
    .line 746
    :goto_d
    iget-boolean v3, v5, Lbl2;->f:Z

    .line 747
    .line 748
    if-eqz v3, :cond_17

    .line 749
    .line 750
    iget-object v7, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->s:Ljava/lang/String;

    .line 751
    .line 752
    if-nez v7, :cond_16

    .line 753
    .line 754
    move-object v7, v9

    .line 755
    :cond_16
    iget-object v8, v2, Lju1;->d:Lbx0;

    .line 756
    .line 757
    sget-object v13, Lbu1;->d:Lbu1;

    .line 758
    .line 759
    move-object/from16 v24, v14

    .line 760
    .line 761
    new-instance v14, Luu1;

    .line 762
    .line 763
    invoke-direct {v14, v7, v13, v8}, Luu1;-><init>(Ljava/lang/String;Lbu1;Lbx0;)V

    .line 764
    .line 765
    .line 766
    move-object/from16 v19, v14

    .line 767
    .line 768
    goto :goto_e

    .line 769
    :cond_17
    move-object/from16 v24, v14

    .line 770
    .line 771
    const/16 v19, 0x0

    .line 772
    .line 773
    :goto_e
    iget-object v7, v5, Lbl2;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 774
    .line 775
    iget-object v7, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 776
    .line 777
    if-eqz v7, :cond_18

    .line 778
    .line 779
    iget-object v7, v7, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->L:Ljava/lang/Boolean;

    .line 780
    .line 781
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 782
    .line 783
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 784
    .line 785
    .line 786
    move-result v7

    .line 787
    goto :goto_f

    .line 788
    :cond_18
    const/4 v7, 0x0

    .line 789
    :goto_f
    if-nez v7, :cond_1a

    .line 790
    .line 791
    iget-object v7, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->r:Ljava/lang/String;

    .line 792
    .line 793
    if-nez v7, :cond_19

    .line 794
    .line 795
    move-object v7, v9

    .line 796
    :cond_19
    iget-object v8, v2, Lju1;->c:Lbx0;

    .line 797
    .line 798
    sget-object v13, Lbu1;->b:Lbu1;

    .line 799
    .line 800
    new-instance v14, Luu1;

    .line 801
    .line 802
    invoke-direct {v14, v7, v13, v8}, Luu1;-><init>(Ljava/lang/String;Lbu1;Lbx0;)V

    .line 803
    .line 804
    .line 805
    move-object/from16 v18, v14

    .line 806
    .line 807
    goto :goto_10

    .line 808
    :cond_1a
    const/16 v18, 0x0

    .line 809
    .line 810
    :goto_10
    iget-object v7, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->q:Ljava/lang/String;

    .line 811
    .line 812
    if-nez v7, :cond_1b

    .line 813
    .line 814
    move-object v7, v9

    .line 815
    :cond_1b
    iget-object v2, v2, Lju1;->b:Lbx0;

    .line 816
    .line 817
    sget-object v8, Lbu1;->a:Lbu1;

    .line 818
    .line 819
    new-instance v13, Luu1;

    .line 820
    .line 821
    invoke-direct {v13, v7, v8, v2}, Luu1;-><init>(Ljava/lang/String;Lbu1;Lbx0;)V

    .line 822
    .line 823
    .line 824
    new-instance v16, Lxy1;

    .line 825
    .line 826
    iget-object v1, v1, Lur3;->d:Ljava/lang/Object;

    .line 827
    .line 828
    move-object/from16 v22, v1

    .line 829
    .line 830
    check-cast v22, Lgl;

    .line 831
    .line 832
    const/16 v23, 0x8

    .line 833
    .line 834
    const/16 v20, 0x0

    .line 835
    .line 836
    move-object/from16 v17, v13

    .line 837
    .line 838
    invoke-direct/range {v16 .. v23}, Lxy1;-><init>(Luu1;Luu1;Luu1;Luu1;Luu1;Lgl;I)V

    .line 839
    .line 840
    .line 841
    new-instance v1, Lij;

    .line 842
    .line 843
    iget-boolean v2, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->l:Z

    .line 844
    .line 845
    const-string v7, "Powered by Usercentrics Consent Management"

    .line 846
    .line 847
    if-eqz v2, :cond_1c

    .line 848
    .line 849
    new-instance v2, Lr4;

    .line 850
    .line 851
    invoke-direct {v2, v7}, Lr4;-><init>(Ljava/lang/String;)V

    .line 852
    .line 853
    .line 854
    goto :goto_11

    .line 855
    :cond_1c
    const/4 v2, 0x0

    .line 856
    :goto_11
    invoke-virtual/range {v16 .. v16}, Lxy1;->h()Ljava/util/ArrayList;

    .line 857
    .line 858
    .line 859
    move-result-object v8

    .line 860
    invoke-virtual/range {v16 .. v16}, Lxy1;->i()Ljava/util/List;

    .line 861
    .line 862
    .line 863
    move-result-object v11

    .line 864
    invoke-direct {v1, v2, v8, v11}, Lij;-><init>(Lr4;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 865
    .line 866
    .line 867
    new-instance v2, Ljava/util/ArrayList;

    .line 868
    .line 869
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 870
    .line 871
    .line 872
    iget-object v8, v12, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->b:Ljava/util/List;

    .line 873
    .line 874
    iget-object v11, v12, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->d:Ljava/util/List;

    .line 875
    .line 876
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 877
    .line 878
    .line 879
    move-result v8

    .line 880
    iget-object v13, v5, Lbl2;->h:Lhk2;

    .line 881
    .line 882
    const/16 v14, 0xa

    .line 883
    .line 884
    if-eqz v8, :cond_1d

    .line 885
    .line 886
    move-object/from16 v19, v7

    .line 887
    .line 888
    move-object/from16 v17, v9

    .line 889
    .line 890
    move-object/from16 v16, v13

    .line 891
    .line 892
    const/4 v7, 0x0

    .line 893
    goto/16 :goto_15

    .line 894
    .line 895
    :cond_1d
    sget-object v8, Ln03;->Companion:Lm03;

    .line 896
    .line 897
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 898
    .line 899
    .line 900
    invoke-static {v12}, Lm03;->b(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)Ljava/util/List;

    .line 901
    .line 902
    .line 903
    move-result-object v8

    .line 904
    move-object/from16 v16, v13

    .line 905
    .line 906
    new-instance v13, Ljava/util/ArrayList;

    .line 907
    .line 908
    move-object/from16 v17, v9

    .line 909
    .line 910
    invoke-static {v8, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 911
    .line 912
    .line 913
    move-result v9

    .line 914
    invoke-direct {v13, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 915
    .line 916
    .line 917
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 918
    .line 919
    .line 920
    move-result-object v8

    .line 921
    :goto_12
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 922
    .line 923
    .line 924
    move-result v9

    .line 925
    if-eqz v9, :cond_1e

    .line 926
    .line 927
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v9

    .line 931
    check-cast v9, Luz1;

    .line 932
    .line 933
    new-instance v14, Lcl2;

    .line 934
    .line 935
    move-object/from16 v19, v8

    .line 936
    .line 937
    iget-boolean v8, v5, Lbl2;->g:Z

    .line 938
    .line 939
    invoke-direct {v14, v9, v3, v8}, Lcl2;-><init>(Luz1;ZZ)V

    .line 940
    .line 941
    .line 942
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 943
    .line 944
    .line 945
    move-object/from16 v8, v19

    .line 946
    .line 947
    const/16 v14, 0xa

    .line 948
    .line 949
    goto :goto_12

    .line 950
    :cond_1e
    invoke-virtual/range {v16 .. v16}, Lhk2;->getValue()Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v8

    .line 954
    check-cast v8, Ljava/util/List;

    .line 955
    .line 956
    new-instance v9, Ljava/util/ArrayList;

    .line 957
    .line 958
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 959
    .line 960
    .line 961
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 962
    .line 963
    .line 964
    move-result-object v8

    .line 965
    :goto_13
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 966
    .line 967
    .line 968
    move-result v14

    .line 969
    if-eqz v14, :cond_20

    .line 970
    .line 971
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 972
    .line 973
    .line 974
    move-result-object v14

    .line 975
    move-object/from16 v19, v8

    .line 976
    .line 977
    move-object v8, v14

    .line 978
    check-cast v8, Leg2;

    .line 979
    .line 980
    iget-object v8, v8, Leg2;->b:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;

    .line 981
    .line 982
    iget-object v8, v8, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->d:Ljava/util/List;

    .line 983
    .line 984
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 985
    .line 986
    .line 987
    move-result v8

    .line 988
    if-nez v8, :cond_1f

    .line 989
    .line 990
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 991
    .line 992
    .line 993
    :cond_1f
    move-object/from16 v8, v19

    .line 994
    .line 995
    goto :goto_13

    .line 996
    :cond_20
    new-instance v8, Ljava/util/ArrayList;

    .line 997
    .line 998
    move-object/from16 v19, v7

    .line 999
    .line 1000
    const/16 v14, 0xa

    .line 1001
    .line 1002
    invoke-static {v9, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 1003
    .line 1004
    .line 1005
    move-result v7

    .line 1006
    invoke-direct {v8, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v7

    .line 1013
    :goto_14
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1014
    .line 1015
    .line 1016
    move-result v9

    .line 1017
    if-eqz v9, :cond_21

    .line 1018
    .line 1019
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v9

    .line 1023
    check-cast v9, Leg2;

    .line 1024
    .line 1025
    iget-object v14, v9, Leg2;->b:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;

    .line 1026
    .line 1027
    iget-object v14, v14, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->d:Ljava/util/List;

    .line 1028
    .line 1029
    invoke-virtual {v5, v9, v14, v13}, Lbl2;->c(Leg2;Ljava/util/List;Ljava/util/ArrayList;)Lcl2;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v9

    .line 1033
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1034
    .line 1035
    .line 1036
    goto :goto_14

    .line 1037
    :cond_21
    iget-object v7, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->i:Ljava/lang/String;

    .line 1038
    .line 1039
    invoke-virtual {v5, v7, v13, v8}, Lbl2;->b(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ldu1;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v7

    .line 1043
    :goto_15
    if-eqz v7, :cond_22

    .line 1044
    .line 1045
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1046
    .line 1047
    .line 1048
    :cond_22
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 1049
    .line 1050
    .line 1051
    move-result v7

    .line 1052
    if-eqz v7, :cond_23

    .line 1053
    .line 1054
    const/4 v7, 0x0

    .line 1055
    goto/16 :goto_1a

    .line 1056
    .line 1057
    :cond_23
    sget-object v7, Ln03;->Companion:Lm03;

    .line 1058
    .line 1059
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1060
    .line 1061
    .line 1062
    new-instance v7, Lwa3;

    .line 1063
    .line 1064
    const/16 v8, 0x10

    .line 1065
    .line 1066
    invoke-direct {v7, v8}, Lwa3;-><init>(I)V

    .line 1067
    .line 1068
    .line 1069
    invoke-static {v7, v11}, Lkotlin/collections/CollectionsKt;->E(Ljava/util/Comparator;Ljava/lang/Iterable;)Ljava/util/List;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v7

    .line 1073
    new-instance v8, Ljava/util/ArrayList;

    .line 1074
    .line 1075
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1076
    .line 1077
    .line 1078
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v7

    .line 1082
    :goto_16
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1083
    .line 1084
    .line 1085
    move-result v9

    .line 1086
    if-eqz v9, :cond_24

    .line 1087
    .line 1088
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v9

    .line 1092
    check-cast v9, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;

    .line 1093
    .line 1094
    new-instance v11, Lzf2;

    .line 1095
    .line 1096
    invoke-direct {v11, v9}, Lzf2;-><init>(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;)V

    .line 1097
    .line 1098
    .line 1099
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1100
    .line 1101
    .line 1102
    goto :goto_16

    .line 1103
    :cond_24
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v7

    .line 1107
    new-instance v8, Ljava/util/ArrayList;

    .line 1108
    .line 1109
    const/16 v14, 0xa

    .line 1110
    .line 1111
    invoke-static {v7, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 1112
    .line 1113
    .line 1114
    move-result v9

    .line 1115
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 1116
    .line 1117
    .line 1118
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v7

    .line 1122
    :goto_17
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1123
    .line 1124
    .line 1125
    move-result v9

    .line 1126
    if-eqz v9, :cond_25

    .line 1127
    .line 1128
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v9

    .line 1132
    check-cast v9, Lzf2;

    .line 1133
    .line 1134
    new-instance v11, Lcl2;

    .line 1135
    .line 1136
    invoke-direct {v11, v9}, Lcl2;-><init>(Lzf2;)V

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1140
    .line 1141
    .line 1142
    goto :goto_17

    .line 1143
    :cond_25
    invoke-virtual/range {v16 .. v16}, Lhk2;->getValue()Ljava/lang/Object;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v7

    .line 1147
    check-cast v7, Ljava/util/List;

    .line 1148
    .line 1149
    new-instance v9, Ljava/util/ArrayList;

    .line 1150
    .line 1151
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1152
    .line 1153
    .line 1154
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v7

    .line 1158
    :cond_26
    :goto_18
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1159
    .line 1160
    .line 1161
    move-result v11

    .line 1162
    if-eqz v11, :cond_27

    .line 1163
    .line 1164
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v11

    .line 1168
    move-object v13, v11

    .line 1169
    check-cast v13, Leg2;

    .line 1170
    .line 1171
    iget-object v13, v13, Leg2;->b:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;

    .line 1172
    .line 1173
    iget-object v13, v13, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->d:Ljava/util/List;

    .line 1174
    .line 1175
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 1176
    .line 1177
    .line 1178
    move-result v13

    .line 1179
    if-nez v13, :cond_26

    .line 1180
    .line 1181
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1182
    .line 1183
    .line 1184
    goto :goto_18

    .line 1185
    :cond_27
    new-instance v7, Ljava/util/ArrayList;

    .line 1186
    .line 1187
    const/16 v14, 0xa

    .line 1188
    .line 1189
    invoke-static {v9, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 1190
    .line 1191
    .line 1192
    move-result v11

    .line 1193
    invoke-direct {v7, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v9

    .line 1200
    :goto_19
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1201
    .line 1202
    .line 1203
    move-result v11

    .line 1204
    if-eqz v11, :cond_28

    .line 1205
    .line 1206
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v11

    .line 1210
    check-cast v11, Leg2;

    .line 1211
    .line 1212
    iget-object v13, v11, Leg2;->b:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;

    .line 1213
    .line 1214
    iget-object v13, v13, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->d:Ljava/util/List;

    .line 1215
    .line 1216
    invoke-virtual {v5, v11, v13, v8}, Lbl2;->c(Leg2;Ljava/util/List;Ljava/util/ArrayList;)Lcl2;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v11

    .line 1220
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1221
    .line 1222
    .line 1223
    goto :goto_19

    .line 1224
    :cond_28
    iget-object v9, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->n:Ljava/lang/String;

    .line 1225
    .line 1226
    invoke-virtual {v5, v9, v8, v7}, Lbl2;->b(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ldu1;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v7

    .line 1230
    :goto_1a
    if-eqz v7, :cond_29

    .line 1231
    .line 1232
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1233
    .line 1234
    .line 1235
    :cond_29
    iget-object v7, v12, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->c:Ljava/util/List;

    .line 1236
    .line 1237
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 1238
    .line 1239
    .line 1240
    move-result v7

    .line 1241
    if-eqz v7, :cond_2a

    .line 1242
    .line 1243
    const/4 v7, 0x0

    .line 1244
    goto/16 :goto_1e

    .line 1245
    .line 1246
    :cond_2a
    sget-object v7, Ln03;->Companion:Lm03;

    .line 1247
    .line 1248
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1249
    .line 1250
    .line 1251
    invoke-static {v12}, Lm03;->c(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)Ljava/util/List;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v7

    .line 1255
    new-instance v8, Ljava/util/ArrayList;

    .line 1256
    .line 1257
    const/16 v14, 0xa

    .line 1258
    .line 1259
    invoke-static {v7, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 1260
    .line 1261
    .line 1262
    move-result v9

    .line 1263
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 1264
    .line 1265
    .line 1266
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v7

    .line 1270
    :goto_1b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1271
    .line 1272
    .line 1273
    move-result v9

    .line 1274
    if-eqz v9, :cond_2b

    .line 1275
    .line 1276
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v9

    .line 1280
    check-cast v9, Lyf2;

    .line 1281
    .line 1282
    new-instance v11, Lcl2;

    .line 1283
    .line 1284
    invoke-direct {v11, v9, v3}, Lcl2;-><init>(Lyf2;Z)V

    .line 1285
    .line 1286
    .line 1287
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1288
    .line 1289
    .line 1290
    goto :goto_1b

    .line 1291
    :cond_2b
    invoke-virtual/range {v16 .. v16}, Lhk2;->getValue()Ljava/lang/Object;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v7

    .line 1295
    check-cast v7, Ljava/util/List;

    .line 1296
    .line 1297
    new-instance v9, Ljava/util/ArrayList;

    .line 1298
    .line 1299
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1300
    .line 1301
    .line 1302
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v7

    .line 1306
    :cond_2c
    :goto_1c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1307
    .line 1308
    .line 1309
    move-result v11

    .line 1310
    if-eqz v11, :cond_2d

    .line 1311
    .line 1312
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v11

    .line 1316
    move-object v12, v11

    .line 1317
    check-cast v12, Leg2;

    .line 1318
    .line 1319
    iget-object v12, v12, Leg2;->b:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;

    .line 1320
    .line 1321
    iget-object v12, v12, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->e:Ljava/util/List;

    .line 1322
    .line 1323
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 1324
    .line 1325
    .line 1326
    move-result v12

    .line 1327
    if-nez v12, :cond_2c

    .line 1328
    .line 1329
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1330
    .line 1331
    .line 1332
    goto :goto_1c

    .line 1333
    :cond_2d
    new-instance v7, Ljava/util/ArrayList;

    .line 1334
    .line 1335
    const/16 v14, 0xa

    .line 1336
    .line 1337
    invoke-static {v9, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 1338
    .line 1339
    .line 1340
    move-result v11

    .line 1341
    invoke-direct {v7, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 1342
    .line 1343
    .line 1344
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v9

    .line 1348
    :goto_1d
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1349
    .line 1350
    .line 1351
    move-result v11

    .line 1352
    if-eqz v11, :cond_2e

    .line 1353
    .line 1354
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v11

    .line 1358
    check-cast v11, Leg2;

    .line 1359
    .line 1360
    iget-object v12, v11, Leg2;->b:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;

    .line 1361
    .line 1362
    iget-object v12, v12, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->e:Ljava/util/List;

    .line 1363
    .line 1364
    invoke-virtual {v5, v11, v12, v8}, Lbl2;->c(Leg2;Ljava/util/List;Ljava/util/ArrayList;)Lcl2;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v11

    .line 1368
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1369
    .line 1370
    .line 1371
    goto :goto_1d

    .line 1372
    :cond_2e
    iget-object v9, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->m:Ljava/lang/String;

    .line 1373
    .line 1374
    invoke-virtual {v5, v9, v8, v7}, Lbl2;->b(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ldu1;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v7

    .line 1378
    :goto_1e
    if-eqz v7, :cond_2f

    .line 1379
    .line 1380
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1381
    .line 1382
    .line 1383
    :cond_2f
    iget-boolean v7, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->W:Z

    .line 1384
    .line 1385
    if-eqz v7, :cond_30

    .line 1386
    .line 1387
    :goto_1f
    const/4 v11, 0x0

    .line 1388
    goto :goto_22

    .line 1389
    :cond_30
    iget-object v7, v5, Lbl2;->d:Ljava/util/List;

    .line 1390
    .line 1391
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 1392
    .line 1393
    .line 1394
    move-result v8

    .line 1395
    if-eqz v8, :cond_31

    .line 1396
    .line 1397
    goto :goto_1f

    .line 1398
    :cond_31
    sget-object v8, Ln03;->Companion:Lm03;

    .line 1399
    .line 1400
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1401
    .line 1402
    .line 1403
    iget-object v5, v5, Lbl2;->e:Ljava/util/List;

    .line 1404
    .line 1405
    invoke-static {v7, v5}, Lm03;->a(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v5

    .line 1409
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1410
    .line 1411
    .line 1412
    move-result v7

    .line 1413
    if-eqz v7, :cond_32

    .line 1414
    .line 1415
    goto :goto_1f

    .line 1416
    :cond_32
    iget-object v0, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->g:Ljava/lang/String;

    .line 1417
    .line 1418
    new-instance v7, Ljava/util/ArrayList;

    .line 1419
    .line 1420
    const/16 v14, 0xa

    .line 1421
    .line 1422
    invoke-static {v5, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 1423
    .line 1424
    .line 1425
    move-result v8

    .line 1426
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1427
    .line 1428
    .line 1429
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v5

    .line 1433
    :goto_20
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1434
    .line 1435
    .line 1436
    move-result v8

    .line 1437
    if-eqz v8, :cond_34

    .line 1438
    .line 1439
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v8

    .line 1443
    check-cast v8, Lxr;

    .line 1444
    .line 1445
    if-nez v3, :cond_33

    .line 1446
    .line 1447
    new-instance v9, Lcu1;

    .line 1448
    .line 1449
    const/4 v11, 0x0

    .line 1450
    const/4 v12, 0x0

    .line 1451
    invoke-direct {v9, v8, v11, v11, v12}, Lcu1;-><init>(Lxr;Lov1;Ljava/lang/String;I)V

    .line 1452
    .line 1453
    .line 1454
    goto :goto_21

    .line 1455
    :cond_33
    const/4 v11, 0x0

    .line 1456
    new-instance v9, Lcu1;

    .line 1457
    .line 1458
    invoke-direct {v9, v8, v11, v11}, Lcu1;-><init>(Lxr;Lov1;Ljava/lang/String;)V

    .line 1459
    .line 1460
    .line 1461
    :goto_21
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1462
    .line 1463
    .line 1464
    goto :goto_20

    .line 1465
    :cond_34
    const/4 v11, 0x0

    .line 1466
    new-instance v3, Ldu1;

    .line 1467
    .line 1468
    invoke-direct {v3, v0, v7, v11}, Ldu1;-><init>(Ljava/lang/String;Ljava/util/List;Lfu1;)V

    .line 1469
    .line 1470
    .line 1471
    move-object v11, v3

    .line 1472
    :goto_22
    if-eqz v11, :cond_35

    .line 1473
    .line 1474
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1475
    .line 1476
    .line 1477
    :cond_35
    invoke-direct {v4, v6, v15, v1, v2}, Ljw2;-><init>(Lfj0;Lf31;Lij;Ljava/util/List;)V

    .line 1478
    .line 1479
    .line 1480
    new-instance v0, Lac1;

    .line 1481
    .line 1482
    iget-object v1, v10, Ldl2;->b:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 1483
    .line 1484
    iget-object v2, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 1485
    .line 1486
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1487
    .line 1488
    .line 1489
    iget-object v3, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->b:Ljava/lang/String;

    .line 1490
    .line 1491
    sget-object v5, Lev1;->Companion:Ldv1;

    .line 1492
    .line 1493
    iget-object v6, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 1494
    .line 1495
    iget-object v7, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->D:Ljava/lang/String;

    .line 1496
    .line 1497
    iget-object v8, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->f:Ljava/lang/String;

    .line 1498
    .line 1499
    sget-object v9, Lez2;->V:Lez2;

    .line 1500
    .line 1501
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1502
    .line 1503
    .line 1504
    invoke-static {v7, v8, v9}, Ldv1;->a(Ljava/lang/String;Ljava/lang/String;Lez2;)Lev1;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v5

    .line 1508
    iget-object v6, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->C:Ljava/lang/String;

    .line 1509
    .line 1510
    iget-object v7, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->e:Ljava/lang/String;

    .line 1511
    .line 1512
    sget-object v8, Lez2;->w:Lez2;

    .line 1513
    .line 1514
    invoke-static {v6, v7, v8}, Ldv1;->a(Ljava/lang/String;Ljava/lang/String;Lez2;)Lev1;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v6

    .line 1518
    filled-new-array {v5, v6}, [Lev1;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v5

    .line 1522
    invoke-static {v5}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v5

    .line 1526
    new-instance v6, Ljava/util/ArrayList;

    .line 1527
    .line 1528
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1529
    .line 1530
    .line 1531
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v5

    .line 1535
    :cond_36
    :goto_23
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1536
    .line 1537
    .line 1538
    move-result v7

    .line 1539
    if-eqz v7, :cond_37

    .line 1540
    .line 1541
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v7

    .line 1545
    move-object v8, v7

    .line 1546
    check-cast v8, Lev1;

    .line 1547
    .line 1548
    invoke-virtual {v8}, Lev1;->a()Z

    .line 1549
    .line 1550
    .line 1551
    move-result v8

    .line 1552
    if-nez v8, :cond_36

    .line 1553
    .line 1554
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1555
    .line 1556
    .line 1557
    goto :goto_23

    .line 1558
    :cond_37
    iget-object v5, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->c0:Ljava/lang/String;

    .line 1559
    .line 1560
    iget-object v7, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->d:Ljava/lang/String;

    .line 1561
    .line 1562
    iget-object v8, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->F:Ljava/lang/String;

    .line 1563
    .line 1564
    if-eqz v5, :cond_39

    .line 1565
    .line 1566
    invoke-static {v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v5

    .line 1570
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v5

    .line 1574
    if-nez v5, :cond_38

    .line 1575
    .line 1576
    goto :goto_24

    .line 1577
    :cond_38
    move-object/from16 v28, v5

    .line 1578
    .line 1579
    goto :goto_25

    .line 1580
    :cond_39
    :goto_24
    move-object/from16 v28, v17

    .line 1581
    .line 1582
    :goto_25
    sget-object v30, Lej0;->a:Lej0;

    .line 1583
    .line 1584
    iget-object v5, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->q:Ljava/util/List;

    .line 1585
    .line 1586
    new-instance v9, Ljava/util/ArrayList;

    .line 1587
    .line 1588
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1589
    .line 1590
    .line 1591
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v5

    .line 1595
    :cond_3a
    :goto_26
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1596
    .line 1597
    .line 1598
    move-result v11

    .line 1599
    if-eqz v11, :cond_3c

    .line 1600
    .line 1601
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v11

    .line 1605
    check-cast v11, Ljava/lang/String;

    .line 1606
    .line 1607
    sget-object v12, Lfz;->a:Ljava/util/Set;

    .line 1608
    .line 1609
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1610
    .line 1611
    .line 1612
    sget-object v12, Lfz;->a:Ljava/util/Set;

    .line 1613
    .line 1614
    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1615
    .line 1616
    invoke-virtual {v11, v13}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v14

    .line 1620
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1621
    .line 1622
    .line 1623
    invoke-interface {v12, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1624
    .line 1625
    .line 1626
    move-result v12

    .line 1627
    if-eqz v12, :cond_3b

    .line 1628
    .line 1629
    goto :goto_27

    .line 1630
    :cond_3b
    invoke-virtual {v11, v13}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v12

    .line 1634
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1635
    .line 1636
    .line 1637
    invoke-static {v12}, Lfz;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v12

    .line 1641
    if-eqz v12, :cond_3a

    .line 1642
    .line 1643
    :goto_27
    new-instance v12, Lbv1;

    .line 1644
    .line 1645
    invoke-direct {v12, v11}, Lbv1;-><init>(Ljava/lang/String;)V

    .line 1646
    .line 1647
    .line 1648
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1649
    .line 1650
    .line 1651
    goto :goto_26

    .line 1652
    :cond_3c
    new-instance v5, Lwa3;

    .line 1653
    .line 1654
    const/16 v11, 0xb

    .line 1655
    .line 1656
    invoke-direct {v5, v11}, Lwa3;-><init>(I)V

    .line 1657
    .line 1658
    .line 1659
    invoke-static {v5, v9}, Lkotlin/collections/CollectionsKt;->E(Ljava/util/Comparator;Ljava/lang/Iterable;)Ljava/util/List;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v5

    .line 1663
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1664
    .line 1665
    .line 1666
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 1667
    .line 1668
    .line 1669
    move-result v9

    .line 1670
    const/4 v11, 0x1

    .line 1671
    if-le v9, v11, :cond_3d

    .line 1672
    .line 1673
    const/4 v9, 0x1

    .line 1674
    goto :goto_28

    .line 1675
    :cond_3d
    const/4 v9, 0x0

    .line 1676
    :goto_28
    if-nez v9, :cond_3e

    .line 1677
    .line 1678
    const/16 v32, 0x0

    .line 1679
    .line 1680
    goto :goto_29

    .line 1681
    :cond_3e
    new-instance v11, Lcv1;

    .line 1682
    .line 1683
    new-instance v9, Lbv1;

    .line 1684
    .line 1685
    iget-object v12, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->d:Ljava/lang/String;

    .line 1686
    .line 1687
    invoke-direct {v9, v12}, Lbv1;-><init>(Ljava/lang/String;)V

    .line 1688
    .line 1689
    .line 1690
    invoke-direct {v11, v5, v9}, Lcv1;-><init>(Ljava/util/List;Lbv1;)V

    .line 1691
    .line 1692
    .line 1693
    move-object/from16 v32, v11

    .line 1694
    .line 1695
    :goto_29
    iget-object v5, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->u:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;

    .line 1696
    .line 1697
    if-eqz v5, :cond_3f

    .line 1698
    .line 1699
    iget-object v11, v5, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;->a:Ljava/lang/String;

    .line 1700
    .line 1701
    move-object/from16 v31, v11

    .line 1702
    .line 1703
    goto :goto_2a

    .line 1704
    :cond_3f
    const/16 v31, 0x0

    .line 1705
    .line 1706
    :goto_2a
    new-instance v26, Lqi1;

    .line 1707
    .line 1708
    move-object/from16 v27, v3

    .line 1709
    .line 1710
    move-object/from16 v29, v6

    .line 1711
    .line 1712
    invoke-direct/range {v26 .. v32}, Lqi1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lej0;Ljava/lang/String;Lcv1;)V

    .line 1713
    .line 1714
    .line 1715
    move-object/from16 v3, v26

    .line 1716
    .line 1717
    iget-boolean v5, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->N:Z

    .line 1718
    .line 1719
    iget-object v6, v10, Ldl2;->e:Lur3;

    .line 1720
    .line 1721
    if-eqz v5, :cond_40

    .line 1722
    .line 1723
    const/16 v28, 0x0

    .line 1724
    .line 1725
    goto :goto_2b

    .line 1726
    :cond_40
    iget-object v5, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->r:Ljava/lang/String;

    .line 1727
    .line 1728
    iget-object v9, v6, Lur3;->b:Ljava/lang/Object;

    .line 1729
    .line 1730
    check-cast v9, Lju1;

    .line 1731
    .line 1732
    iget-object v9, v9, Lju1;->c:Lbx0;

    .line 1733
    .line 1734
    sget-object v11, Lbu1;->b:Lbu1;

    .line 1735
    .line 1736
    new-instance v12, Luu1;

    .line 1737
    .line 1738
    invoke-direct {v12, v5, v11, v9}, Luu1;-><init>(Ljava/lang/String;Lbu1;Lbx0;)V

    .line 1739
    .line 1740
    .line 1741
    move-object/from16 v28, v12

    .line 1742
    .line 1743
    :goto_2b
    iget-object v5, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->q:Ljava/lang/String;

    .line 1744
    .line 1745
    iget-object v9, v6, Lur3;->b:Ljava/lang/Object;

    .line 1746
    .line 1747
    check-cast v9, Lju1;

    .line 1748
    .line 1749
    iget-object v9, v9, Lju1;->b:Lbx0;

    .line 1750
    .line 1751
    sget-object v11, Lbu1;->a:Lbu1;

    .line 1752
    .line 1753
    new-instance v12, Luu1;

    .line 1754
    .line 1755
    invoke-direct {v12, v5, v11, v9}, Luu1;-><init>(Ljava/lang/String;Lbu1;Lbx0;)V

    .line 1756
    .line 1757
    .line 1758
    iget-boolean v5, v10, Ldl2;->V:Z

    .line 1759
    .line 1760
    if-eqz v5, :cond_41

    .line 1761
    .line 1762
    iget-object v9, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->s:Ljava/lang/String;

    .line 1763
    .line 1764
    iget-object v11, v6, Lur3;->b:Ljava/lang/Object;

    .line 1765
    .line 1766
    check-cast v11, Lju1;

    .line 1767
    .line 1768
    iget-object v11, v11, Lju1;->d:Lbx0;

    .line 1769
    .line 1770
    sget-object v13, Lbu1;->d:Lbu1;

    .line 1771
    .line 1772
    new-instance v14, Luu1;

    .line 1773
    .line 1774
    invoke-direct {v14, v9, v13, v11}, Luu1;-><init>(Ljava/lang/String;Lbu1;Lbx0;)V

    .line 1775
    .line 1776
    .line 1777
    move-object/from16 v29, v14

    .line 1778
    .line 1779
    goto :goto_2c

    .line 1780
    :cond_41
    const/16 v29, 0x0

    .line 1781
    .line 1782
    :goto_2c
    new-instance v26, Lxy1;

    .line 1783
    .line 1784
    iget-object v6, v6, Lur3;->d:Ljava/lang/Object;

    .line 1785
    .line 1786
    move-object/from16 v32, v6

    .line 1787
    .line 1788
    check-cast v32, Lgl;

    .line 1789
    .line 1790
    const/16 v33, 0x18

    .line 1791
    .line 1792
    const/16 v30, 0x0

    .line 1793
    .line 1794
    const/16 v31, 0x0

    .line 1795
    .line 1796
    move-object/from16 v27, v12

    .line 1797
    .line 1798
    invoke-direct/range {v26 .. v33}, Lxy1;-><init>(Luu1;Luu1;Luu1;Luu1;Luu1;Lgl;I)V

    .line 1799
    .line 1800
    .line 1801
    new-instance v6, Lij;

    .line 1802
    .line 1803
    iget-boolean v9, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->l:Z

    .line 1804
    .line 1805
    if-eqz v9, :cond_42

    .line 1806
    .line 1807
    new-instance v11, Lr4;

    .line 1808
    .line 1809
    move-object/from16 v9, v19

    .line 1810
    .line 1811
    invoke-direct {v11, v9}, Lr4;-><init>(Ljava/lang/String;)V

    .line 1812
    .line 1813
    .line 1814
    goto :goto_2d

    .line 1815
    :cond_42
    const/4 v11, 0x0

    .line 1816
    :goto_2d
    invoke-virtual/range {v26 .. v26}, Lxy1;->h()Ljava/util/ArrayList;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v9

    .line 1820
    invoke-virtual/range {v26 .. v26}, Lxy1;->i()Ljava/util/List;

    .line 1821
    .line 1822
    .line 1823
    move-result-object v12

    .line 1824
    invoke-direct {v6, v11, v9, v12}, Lij;-><init>(Lr4;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 1825
    .line 1826
    .line 1827
    new-instance v9, Ljava/util/ArrayList;

    .line 1828
    .line 1829
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1830
    .line 1831
    .line 1832
    iget-object v11, v10, Ldl2;->c:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 1833
    .line 1834
    iget-object v12, v11, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->b:Ljava/util/List;

    .line 1835
    .line 1836
    iget-object v13, v11, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->f:Ljava/util/List;

    .line 1837
    .line 1838
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 1839
    .line 1840
    .line 1841
    move-result v12

    .line 1842
    if-eqz v12, :cond_44

    .line 1843
    .line 1844
    sget-object v12, Lnd0;->a:Lnd0;

    .line 1845
    .line 1846
    move-object/from16 v20, v0

    .line 1847
    .line 1848
    move-object/from16 v16, v4

    .line 1849
    .line 1850
    :cond_43
    move-object/from16 v26, v3

    .line 1851
    .line 1852
    move-object/from16 v21, v6

    .line 1853
    .line 1854
    goto/16 :goto_31

    .line 1855
    .line 1856
    :cond_44
    sget-object v12, Ln03;->Companion:Lm03;

    .line 1857
    .line 1858
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1859
    .line 1860
    .line 1861
    invoke-static {v11}, Lm03;->b(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)Ljava/util/List;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v12

    .line 1865
    new-instance v14, Ljava/util/ArrayList;

    .line 1866
    .line 1867
    move-object/from16 v16, v4

    .line 1868
    .line 1869
    const/16 v15, 0xa

    .line 1870
    .line 1871
    invoke-static {v12, v15}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 1872
    .line 1873
    .line 1874
    move-result v4

    .line 1875
    invoke-direct {v14, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1876
    .line 1877
    .line 1878
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1879
    .line 1880
    .line 1881
    move-result-object v4

    .line 1882
    :goto_2e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1883
    .line 1884
    .line 1885
    move-result v12

    .line 1886
    if-eqz v12, :cond_45

    .line 1887
    .line 1888
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v12

    .line 1892
    check-cast v12, Luz1;

    .line 1893
    .line 1894
    new-instance v15, Lcl2;

    .line 1895
    .line 1896
    move-object/from16 v19, v4

    .line 1897
    .line 1898
    iget-boolean v4, v10, Ldl2;->W:Z

    .line 1899
    .line 1900
    move-object/from16 v20, v0

    .line 1901
    .line 1902
    const/4 v0, 0x0

    .line 1903
    invoke-direct {v15, v12, v0, v4}, Lcl2;-><init>(Luz1;ZZ)V

    .line 1904
    .line 1905
    .line 1906
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1907
    .line 1908
    .line 1909
    move-object/from16 v4, v19

    .line 1910
    .line 1911
    move-object/from16 v0, v20

    .line 1912
    .line 1913
    goto :goto_2e

    .line 1914
    :cond_45
    move-object/from16 v20, v0

    .line 1915
    .line 1916
    new-instance v12, Ljava/util/ArrayList;

    .line 1917
    .line 1918
    const/16 v15, 0xa

    .line 1919
    .line 1920
    invoke-static {v14, v15}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 1921
    .line 1922
    .line 1923
    move-result v0

    .line 1924
    invoke-direct {v12, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1925
    .line 1926
    .line 1927
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1928
    .line 1929
    .line 1930
    move-result-object v0

    .line 1931
    :goto_2f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1932
    .line 1933
    .line 1934
    move-result v4

    .line 1935
    if-eqz v4, :cond_43

    .line 1936
    .line 1937
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1938
    .line 1939
    .line 1940
    move-result-object v4

    .line 1941
    check-cast v4, Lcl2;

    .line 1942
    .line 1943
    new-instance v14, Lcu1;

    .line 1944
    .line 1945
    new-instance v15, Liv1;

    .line 1946
    .line 1947
    move-object/from16 v19, v0

    .line 1948
    .line 1949
    new-instance v0, Lqv1;

    .line 1950
    .line 1951
    move-object/from16 v26, v3

    .line 1952
    .line 1953
    iget-object v3, v4, Lcl2;->h:Ljava/lang/String;

    .line 1954
    .line 1955
    move-object/from16 v21, v6

    .line 1956
    .line 1957
    iget-object v6, v4, Lcl2;->i:Ljava/util/List;

    .line 1958
    .line 1959
    invoke-direct {v0, v8, v3, v6}, Lqv1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 1960
    .line 1961
    .line 1962
    new-instance v3, Ljv1;

    .line 1963
    .line 1964
    iget-object v6, v4, Lcl2;->m:Ljava/lang/Integer;

    .line 1965
    .line 1966
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v6

    .line 1970
    invoke-direct {v3, v7, v6}, Ljv1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1971
    .line 1972
    .line 1973
    invoke-direct {v15, v0, v3}, Liv1;-><init>(Lqv1;Ljv1;)V

    .line 1974
    .line 1975
    .line 1976
    if-eqz v5, :cond_46

    .line 1977
    .line 1978
    invoke-virtual {v10, v4}, Ldl2;->A(Lcl2;)Ljava/util/ArrayList;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v0

    .line 1982
    goto :goto_30

    .line 1983
    :cond_46
    const/4 v0, 0x0

    .line 1984
    :goto_30
    invoke-direct {v14, v4, v15, v0}, Lcu1;-><init>(Lcl2;Lpg3;Ljava/util/ArrayList;)V

    .line 1985
    .line 1986
    .line 1987
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1988
    .line 1989
    .line 1990
    move-object/from16 v0, v19

    .line 1991
    .line 1992
    move-object/from16 v6, v21

    .line 1993
    .line 1994
    move-object/from16 v3, v26

    .line 1995
    .line 1996
    goto :goto_2f

    .line 1997
    :goto_31
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 1998
    .line 1999
    .line 2000
    move-result v0

    .line 2001
    if-eqz v0, :cond_47

    .line 2002
    .line 2003
    const/4 v0, 0x0

    .line 2004
    goto :goto_32

    .line 2005
    :cond_47
    new-instance v0, Ldu1;

    .line 2006
    .line 2007
    iget-object v3, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->i:Ljava/lang/String;

    .line 2008
    .line 2009
    invoke-direct {v0, v3, v12}, Ldu1;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 2010
    .line 2011
    .line 2012
    :goto_32
    if-eqz v0, :cond_48

    .line 2013
    .line 2014
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2015
    .line 2016
    .line 2017
    :cond_48
    iget-object v0, v11, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->d:Ljava/util/List;

    .line 2018
    .line 2019
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2020
    .line 2021
    .line 2022
    move-result v3

    .line 2023
    if-eqz v3, :cond_49

    .line 2024
    .line 2025
    sget-object v0, Lnd0;->a:Lnd0;

    .line 2026
    .line 2027
    goto :goto_34

    .line 2028
    :cond_49
    new-instance v3, Ljava/util/ArrayList;

    .line 2029
    .line 2030
    const/16 v14, 0xa

    .line 2031
    .line 2032
    invoke-static {v0, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 2033
    .line 2034
    .line 2035
    move-result v4

    .line 2036
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 2037
    .line 2038
    .line 2039
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2040
    .line 2041
    .line 2042
    move-result-object v0

    .line 2043
    :goto_33
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2044
    .line 2045
    .line 2046
    move-result v4

    .line 2047
    if-eqz v4, :cond_4a

    .line 2048
    .line 2049
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2050
    .line 2051
    .line 2052
    move-result-object v4

    .line 2053
    check-cast v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;

    .line 2054
    .line 2055
    new-instance v27, Lcu1;

    .line 2056
    .line 2057
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2058
    .line 2059
    .line 2060
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2061
    .line 2062
    .line 2063
    sget-object v6, Lya2;->Companion:Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;

    .line 2064
    .line 2065
    invoke-virtual {v6, v4}, Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;->id(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;)Ljava/lang/String;

    .line 2066
    .line 2067
    .line 2068
    move-result-object v28

    .line 2069
    iget-object v6, v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;->d:Ljava/lang/String;

    .line 2070
    .line 2071
    new-instance v12, Lqv1;

    .line 2072
    .line 2073
    iget-object v14, v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;->a:Ljava/lang/String;

    .line 2074
    .line 2075
    iget-object v4, v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;->b:Ljava/util/List;

    .line 2076
    .line 2077
    invoke-direct {v12, v8, v14, v4}, Lqv1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 2078
    .line 2079
    .line 2080
    const/16 v33, 0x0

    .line 2081
    .line 2082
    const/16 v34, 0x60

    .line 2083
    .line 2084
    const/16 v30, 0x0

    .line 2085
    .line 2086
    const/16 v31, 0x0

    .line 2087
    .line 2088
    move-object/from16 v29, v6

    .line 2089
    .line 2090
    move-object/from16 v32, v12

    .line 2091
    .line 2092
    invoke-direct/range {v27 .. v34}, Lcu1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvv1;Lpg3;Ljava/util/List;I)V

    .line 2093
    .line 2094
    .line 2095
    move-object/from16 v4, v27

    .line 2096
    .line 2097
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2098
    .line 2099
    .line 2100
    goto :goto_33

    .line 2101
    :cond_4a
    move-object v0, v3

    .line 2102
    :goto_34
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2103
    .line 2104
    .line 2105
    move-result v3

    .line 2106
    if-eqz v3, :cond_4b

    .line 2107
    .line 2108
    const/4 v3, 0x0

    .line 2109
    goto :goto_35

    .line 2110
    :cond_4b
    new-instance v3, Ldu1;

    .line 2111
    .line 2112
    iget-object v4, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->n:Ljava/lang/String;

    .line 2113
    .line 2114
    invoke-direct {v3, v4, v0}, Ldu1;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 2115
    .line 2116
    .line 2117
    :goto_35
    if-eqz v3, :cond_4c

    .line 2118
    .line 2119
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2120
    .line 2121
    .line 2122
    :cond_4c
    iget-object v0, v11, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->a:Ljava/util/List;

    .line 2123
    .line 2124
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2125
    .line 2126
    .line 2127
    move-result v3

    .line 2128
    if-eqz v3, :cond_4d

    .line 2129
    .line 2130
    sget-object v0, Lnd0;->a:Lnd0;

    .line 2131
    .line 2132
    goto :goto_37

    .line 2133
    :cond_4d
    new-instance v3, Ljava/util/ArrayList;

    .line 2134
    .line 2135
    const/16 v14, 0xa

    .line 2136
    .line 2137
    invoke-static {v0, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 2138
    .line 2139
    .line 2140
    move-result v4

    .line 2141
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 2142
    .line 2143
    .line 2144
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2145
    .line 2146
    .line 2147
    move-result-object v0

    .line 2148
    :goto_36
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2149
    .line 2150
    .line 2151
    move-result v4

    .line 2152
    if-eqz v4, :cond_4e

    .line 2153
    .line 2154
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v4

    .line 2158
    check-cast v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFFeature;

    .line 2159
    .line 2160
    new-instance v27, Lcu1;

    .line 2161
    .line 2162
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2163
    .line 2164
    .line 2165
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2166
    .line 2167
    .line 2168
    sget-object v6, Lya2;->Companion:Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;

    .line 2169
    .line 2170
    invoke-virtual {v6, v4}, Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;->id(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFFeature;)Ljava/lang/String;

    .line 2171
    .line 2172
    .line 2173
    move-result-object v28

    .line 2174
    iget-object v6, v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFFeature;->d:Ljava/lang/String;

    .line 2175
    .line 2176
    new-instance v12, Lqv1;

    .line 2177
    .line 2178
    iget-object v14, v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFFeature;->a:Ljava/lang/String;

    .line 2179
    .line 2180
    iget-object v4, v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFFeature;->b:Ljava/util/List;

    .line 2181
    .line 2182
    invoke-direct {v12, v8, v14, v4}, Lqv1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 2183
    .line 2184
    .line 2185
    const/16 v33, 0x0

    .line 2186
    .line 2187
    const/16 v34, 0x60

    .line 2188
    .line 2189
    const/16 v30, 0x0

    .line 2190
    .line 2191
    const/16 v31, 0x0

    .line 2192
    .line 2193
    move-object/from16 v29, v6

    .line 2194
    .line 2195
    move-object/from16 v32, v12

    .line 2196
    .line 2197
    invoke-direct/range {v27 .. v34}, Lcu1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvv1;Lpg3;Ljava/util/List;I)V

    .line 2198
    .line 2199
    .line 2200
    move-object/from16 v4, v27

    .line 2201
    .line 2202
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2203
    .line 2204
    .line 2205
    goto :goto_36

    .line 2206
    :cond_4e
    move-object v0, v3

    .line 2207
    :goto_37
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2208
    .line 2209
    .line 2210
    move-result v3

    .line 2211
    if-eqz v3, :cond_4f

    .line 2212
    .line 2213
    const/4 v3, 0x0

    .line 2214
    goto :goto_38

    .line 2215
    :cond_4f
    new-instance v3, Ldu1;

    .line 2216
    .line 2217
    iget-object v4, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->e:Ljava/lang/String;

    .line 2218
    .line 2219
    invoke-direct {v3, v4, v0}, Ldu1;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 2220
    .line 2221
    .line 2222
    :goto_38
    if-eqz v3, :cond_50

    .line 2223
    .line 2224
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2225
    .line 2226
    .line 2227
    :cond_50
    iget-object v0, v11, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->c:Ljava/util/List;

    .line 2228
    .line 2229
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2230
    .line 2231
    .line 2232
    move-result v0

    .line 2233
    if-eqz v0, :cond_52

    .line 2234
    .line 2235
    sget-object v0, Lnd0;->a:Lnd0;

    .line 2236
    .line 2237
    :cond_51
    const/4 v12, 0x0

    .line 2238
    goto :goto_3b

    .line 2239
    :cond_52
    sget-object v0, Ln03;->Companion:Lm03;

    .line 2240
    .line 2241
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2242
    .line 2243
    .line 2244
    invoke-static {v11}, Lm03;->c(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)Ljava/util/List;

    .line 2245
    .line 2246
    .line 2247
    move-result-object v0

    .line 2248
    new-instance v3, Ljava/util/ArrayList;

    .line 2249
    .line 2250
    const/16 v14, 0xa

    .line 2251
    .line 2252
    invoke-static {v0, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 2253
    .line 2254
    .line 2255
    move-result v4

    .line 2256
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 2257
    .line 2258
    .line 2259
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2260
    .line 2261
    .line 2262
    move-result-object v0

    .line 2263
    :goto_39
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2264
    .line 2265
    .line 2266
    move-result v4

    .line 2267
    if-eqz v4, :cond_53

    .line 2268
    .line 2269
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2270
    .line 2271
    .line 2272
    move-result-object v4

    .line 2273
    check-cast v4, Lyf2;

    .line 2274
    .line 2275
    new-instance v6, Lcl2;

    .line 2276
    .line 2277
    invoke-direct {v6, v4, v5}, Lcl2;-><init>(Lyf2;Z)V

    .line 2278
    .line 2279
    .line 2280
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2281
    .line 2282
    .line 2283
    goto :goto_39

    .line 2284
    :cond_53
    new-instance v0, Ljava/util/ArrayList;

    .line 2285
    .line 2286
    const/16 v14, 0xa

    .line 2287
    .line 2288
    invoke-static {v3, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 2289
    .line 2290
    .line 2291
    move-result v4

    .line 2292
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 2293
    .line 2294
    .line 2295
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v3

    .line 2299
    :goto_3a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2300
    .line 2301
    .line 2302
    move-result v4

    .line 2303
    if-eqz v4, :cond_51

    .line 2304
    .line 2305
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2306
    .line 2307
    .line 2308
    move-result-object v4

    .line 2309
    check-cast v4, Lcl2;

    .line 2310
    .line 2311
    new-instance v6, Lcu1;

    .line 2312
    .line 2313
    new-instance v11, Lqv1;

    .line 2314
    .line 2315
    iget-object v12, v4, Lcl2;->h:Ljava/lang/String;

    .line 2316
    .line 2317
    iget-object v14, v4, Lcl2;->i:Ljava/util/List;

    .line 2318
    .line 2319
    invoke-direct {v11, v8, v12, v14}, Lqv1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 2320
    .line 2321
    .line 2322
    const/4 v12, 0x0

    .line 2323
    invoke-direct {v6, v4, v11, v12}, Lcu1;-><init>(Lcl2;Lpg3;Ljava/util/ArrayList;)V

    .line 2324
    .line 2325
    .line 2326
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2327
    .line 2328
    .line 2329
    goto :goto_3a

    .line 2330
    :goto_3b
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2331
    .line 2332
    .line 2333
    move-result v3

    .line 2334
    if-eqz v3, :cond_54

    .line 2335
    .line 2336
    move-object v11, v12

    .line 2337
    goto :goto_3c

    .line 2338
    :cond_54
    new-instance v11, Ldu1;

    .line 2339
    .line 2340
    iget-object v3, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->m:Ljava/lang/String;

    .line 2341
    .line 2342
    invoke-direct {v11, v3, v0}, Ldu1;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 2343
    .line 2344
    .line 2345
    :goto_3c
    if-eqz v11, :cond_55

    .line 2346
    .line 2347
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2348
    .line 2349
    .line 2350
    :cond_55
    iget-object v0, v10, Ldl2;->f:Ljava/util/List;

    .line 2351
    .line 2352
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2353
    .line 2354
    .line 2355
    move-result v3

    .line 2356
    iget-object v4, v10, Ldl2;->i:Ljava/util/List;

    .line 2357
    .line 2358
    if-eqz v3, :cond_56

    .line 2359
    .line 2360
    sget-object v0, Lnd0;->a:Lnd0;

    .line 2361
    .line 2362
    goto/16 :goto_41

    .line 2363
    .line 2364
    :cond_56
    sget-object v3, Ln03;->Companion:Lm03;

    .line 2365
    .line 2366
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2367
    .line 2368
    .line 2369
    invoke-static {v0, v4}, Lm03;->a(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 2370
    .line 2371
    .line 2372
    move-result-object v0

    .line 2373
    new-instance v3, Ljava/util/ArrayList;

    .line 2374
    .line 2375
    const/16 v14, 0xa

    .line 2376
    .line 2377
    invoke-static {v0, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 2378
    .line 2379
    .line 2380
    move-result v6

    .line 2381
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 2382
    .line 2383
    .line 2384
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2385
    .line 2386
    .line 2387
    move-result-object v0

    .line 2388
    :goto_3d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2389
    .line 2390
    .line 2391
    move-result v6

    .line 2392
    if-eqz v6, :cond_5a

    .line 2393
    .line 2394
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2395
    .line 2396
    .line 2397
    move-result-object v6

    .line 2398
    check-cast v6, Lxr;

    .line 2399
    .line 2400
    if-nez v5, :cond_58

    .line 2401
    .line 2402
    iget-object v8, v6, Lxr;->c:Ljava/util/ArrayList;

    .line 2403
    .line 2404
    new-instance v11, Ljava/util/ArrayList;

    .line 2405
    .line 2406
    invoke-static {v8, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 2407
    .line 2408
    .line 2409
    move-result v15

    .line 2410
    invoke-direct {v11, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 2411
    .line 2412
    .line 2413
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2414
    .line 2415
    .line 2416
    move-result-object v8

    .line 2417
    :goto_3e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2418
    .line 2419
    .line 2420
    move-result v14

    .line 2421
    if-eqz v14, :cond_57

    .line 2422
    .line 2423
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2424
    .line 2425
    .line 2426
    move-result-object v14

    .line 2427
    check-cast v14, Lm61;

    .line 2428
    .line 2429
    new-instance v27, Lmv1;

    .line 2430
    .line 2431
    iget-object v15, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->B:Lq90;

    .line 2432
    .line 2433
    iget-object v12, v14, Lm61;->p:Li61;

    .line 2434
    .line 2435
    invoke-virtual {v10, v12}, Lsq3;->l(Li61;)Lkv1;

    .line 2436
    .line 2437
    .line 2438
    move-result-object v32

    .line 2439
    const/16 v33, 0x2

    .line 2440
    .line 2441
    const/16 v29, 0x0

    .line 2442
    .line 2443
    const/16 v30, 0x1

    .line 2444
    .line 2445
    move-object/from16 v28, v14

    .line 2446
    .line 2447
    move-object/from16 v31, v15

    .line 2448
    .line 2449
    invoke-direct/range {v27 .. v33}, Lmv1;-><init>(Lm61;Llv1;ZLq90;Lkv1;I)V

    .line 2450
    .line 2451
    .line 2452
    move-object/from16 v12, v27

    .line 2453
    .line 2454
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2455
    .line 2456
    .line 2457
    const/4 v12, 0x0

    .line 2458
    goto :goto_3e

    .line 2459
    :cond_57
    new-instance v8, Lov1;

    .line 2460
    .line 2461
    invoke-direct {v8, v11}, Lov1;-><init>(Ljava/util/ArrayList;)V

    .line 2462
    .line 2463
    .line 2464
    iget-object v11, v6, Lxr;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;

    .line 2465
    .line 2466
    iget-object v11, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;->c:Ljava/lang/String;

    .line 2467
    .line 2468
    new-instance v12, Lcu1;

    .line 2469
    .line 2470
    const/4 v14, 0x0

    .line 2471
    invoke-direct {v12, v6, v8, v11, v14}, Lcu1;-><init>(Lxr;Lov1;Ljava/lang/String;I)V

    .line 2472
    .line 2473
    .line 2474
    goto :goto_40

    .line 2475
    :cond_58
    iget-object v8, v6, Lxr;->c:Ljava/util/ArrayList;

    .line 2476
    .line 2477
    new-instance v11, Ljava/util/ArrayList;

    .line 2478
    .line 2479
    const/16 v14, 0xa

    .line 2480
    .line 2481
    invoke-static {v8, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 2482
    .line 2483
    .line 2484
    move-result v12

    .line 2485
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 2486
    .line 2487
    .line 2488
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2489
    .line 2490
    .line 2491
    move-result-object v8

    .line 2492
    :goto_3f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2493
    .line 2494
    .line 2495
    move-result v12

    .line 2496
    if-eqz v12, :cond_59

    .line 2497
    .line 2498
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2499
    .line 2500
    .line 2501
    move-result-object v12

    .line 2502
    check-cast v12, Lm61;

    .line 2503
    .line 2504
    new-instance v27, Lmv1;

    .line 2505
    .line 2506
    iget-object v14, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->B:Lq90;

    .line 2507
    .line 2508
    iget-object v15, v12, Lm61;->p:Li61;

    .line 2509
    .line 2510
    invoke-virtual {v10, v15}, Lsq3;->l(Li61;)Lkv1;

    .line 2511
    .line 2512
    .line 2513
    move-result-object v32

    .line 2514
    const/16 v33, 0x6

    .line 2515
    .line 2516
    const/16 v29, 0x0

    .line 2517
    .line 2518
    const/16 v30, 0x0

    .line 2519
    .line 2520
    move-object/from16 v28, v12

    .line 2521
    .line 2522
    move-object/from16 v31, v14

    .line 2523
    .line 2524
    invoke-direct/range {v27 .. v33}, Lmv1;-><init>(Lm61;Llv1;ZLq90;Lkv1;I)V

    .line 2525
    .line 2526
    .line 2527
    move-object/from16 v12, v27

    .line 2528
    .line 2529
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2530
    .line 2531
    .line 2532
    goto :goto_3f

    .line 2533
    :cond_59
    new-instance v8, Lov1;

    .line 2534
    .line 2535
    invoke-direct {v8, v11}, Lov1;-><init>(Ljava/util/ArrayList;)V

    .line 2536
    .line 2537
    .line 2538
    iget-object v11, v6, Lxr;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;

    .line 2539
    .line 2540
    iget-object v11, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;->c:Ljava/lang/String;

    .line 2541
    .line 2542
    new-instance v12, Lcu1;

    .line 2543
    .line 2544
    invoke-direct {v12, v6, v8, v11}, Lcu1;-><init>(Lxr;Lov1;Ljava/lang/String;)V

    .line 2545
    .line 2546
    .line 2547
    :goto_40
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2548
    .line 2549
    .line 2550
    const/4 v12, 0x0

    .line 2551
    const/16 v14, 0xa

    .line 2552
    .line 2553
    goto/16 :goto_3d

    .line 2554
    .line 2555
    :cond_5a
    move-object v0, v3

    .line 2556
    :goto_41
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2557
    .line 2558
    .line 2559
    move-result v3

    .line 2560
    if-eqz v3, :cond_5b

    .line 2561
    .line 2562
    const/4 v11, 0x0

    .line 2563
    goto :goto_42

    .line 2564
    :cond_5b
    new-instance v11, Ldu1;

    .line 2565
    .line 2566
    iget-object v3, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->g:Ljava/lang/String;

    .line 2567
    .line 2568
    invoke-direct {v11, v3, v0}, Ldu1;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 2569
    .line 2570
    .line 2571
    :goto_42
    if-eqz v11, :cond_5c

    .line 2572
    .line 2573
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2574
    .line 2575
    .line 2576
    :cond_5c
    new-instance v0, Lxv1;

    .line 2577
    .line 2578
    iget-object v3, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->c:Ljava/lang/String;

    .line 2579
    .line 2580
    new-instance v6, Leu1;

    .line 2581
    .line 2582
    invoke-direct {v6, v9}, Leu1;-><init>(Ljava/util/List;)V

    .line 2583
    .line 2584
    .line 2585
    invoke-direct {v0, v3, v6}, Lxv1;-><init>(Ljava/lang/String;Lwv1;)V

    .line 2586
    .line 2587
    .line 2588
    new-instance v3, Ljava/util/ArrayList;

    .line 2589
    .line 2590
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2591
    .line 2592
    .line 2593
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 2594
    .line 2595
    .line 2596
    move-result v6

    .line 2597
    iget-object v9, v10, Ldl2;->v:Lac1;

    .line 2598
    .line 2599
    if-eqz v6, :cond_5d

    .line 2600
    .line 2601
    move-object/from16 v49, v0

    .line 2602
    .line 2603
    move-object/from16 v51, v1

    .line 2604
    .line 2605
    move-object/from16 v22, v4

    .line 2606
    .line 2607
    move/from16 v23, v5

    .line 2608
    .line 2609
    move-object/from16 v50, v7

    .line 2610
    .line 2611
    const/4 v11, 0x0

    .line 2612
    goto/16 :goto_51

    .line 2613
    .line 2614
    :cond_5d
    sget-object v6, Ln03;->Companion:Lm03;

    .line 2615
    .line 2616
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2617
    .line 2618
    .line 2619
    sget-object v6, Lnk2;->V:Lnk2;

    .line 2620
    .line 2621
    invoke-static {v13, v6}, Lhu0;->D0(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 2622
    .line 2623
    .line 2624
    move-result-object v6

    .line 2625
    new-instance v11, Ljava/util/ArrayList;

    .line 2626
    .line 2627
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 2628
    .line 2629
    .line 2630
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2631
    .line 2632
    .line 2633
    move-result-object v6

    .line 2634
    :goto_43
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 2635
    .line 2636
    .line 2637
    move-result v12

    .line 2638
    if-eqz v12, :cond_60

    .line 2639
    .line 2640
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2641
    .line 2642
    .line 2643
    move-result-object v12

    .line 2644
    check-cast v12, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 2645
    .line 2646
    new-instance v13, Lb23;

    .line 2647
    .line 2648
    iget-object v14, v12, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->a:Ljava/lang/Boolean;

    .line 2649
    .line 2650
    if-eqz v14, :cond_5e

    .line 2651
    .line 2652
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2653
    .line 2654
    .line 2655
    move-result v14

    .line 2656
    goto :goto_44

    .line 2657
    :cond_5e
    const/4 v14, 0x0

    .line 2658
    :goto_44
    iget-object v15, v12, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->e:Ljava/lang/Boolean;

    .line 2659
    .line 2660
    if-eqz v15, :cond_5f

    .line 2661
    .line 2662
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2663
    .line 2664
    .line 2665
    move-result v15

    .line 2666
    goto :goto_45

    .line 2667
    :cond_5f
    const/4 v15, 0x1

    .line 2668
    :goto_45
    invoke-direct {v13, v14, v15, v12}, Lb23;-><init>(ZZLcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;)V

    .line 2669
    .line 2670
    .line 2671
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2672
    .line 2673
    .line 2674
    goto :goto_43

    .line 2675
    :cond_60
    new-instance v6, Ljava/util/ArrayList;

    .line 2676
    .line 2677
    const/16 v14, 0xa

    .line 2678
    .line 2679
    invoke-static {v11, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 2680
    .line 2681
    .line 2682
    move-result v12

    .line 2683
    invoke-direct {v6, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 2684
    .line 2685
    .line 2686
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2687
    .line 2688
    .line 2689
    move-result-object v11

    .line 2690
    :goto_46
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 2691
    .line 2692
    .line 2693
    move-result v12

    .line 2694
    if-eqz v12, :cond_61

    .line 2695
    .line 2696
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2697
    .line 2698
    .line 2699
    move-result-object v12

    .line 2700
    check-cast v12, Lb23;

    .line 2701
    .line 2702
    new-instance v13, Lol2;

    .line 2703
    .line 2704
    invoke-direct {v13, v12, v1, v9}, Lol2;-><init>(Lb23;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lac1;)V

    .line 2705
    .line 2706
    .line 2707
    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2708
    .line 2709
    .line 2710
    goto :goto_46

    .line 2711
    :cond_61
    new-instance v11, Ljava/util/ArrayList;

    .line 2712
    .line 2713
    const/16 v14, 0xa

    .line 2714
    .line 2715
    invoke-static {v6, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 2716
    .line 2717
    .line 2718
    move-result v12

    .line 2719
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 2720
    .line 2721
    .line 2722
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2723
    .line 2724
    .line 2725
    move-result-object v6

    .line 2726
    :goto_47
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 2727
    .line 2728
    .line 2729
    move-result v12

    .line 2730
    if-eqz v12, :cond_6a

    .line 2731
    .line 2732
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2733
    .line 2734
    .line 2735
    move-result-object v12

    .line 2736
    check-cast v12, Lol2;

    .line 2737
    .line 2738
    iget-object v13, v12, Lol2;->c:Lcl2;

    .line 2739
    .line 2740
    new-instance v14, Lcu1;

    .line 2741
    .line 2742
    new-instance v15, Lsv1;

    .line 2743
    .line 2744
    new-instance v27, Lmv1;

    .line 2745
    .line 2746
    iget-object v8, v13, Lcl2;->a:Ljava/lang/String;

    .line 2747
    .line 2748
    move-object/from16 v22, v4

    .line 2749
    .line 2750
    iget-object v4, v12, Lol2;->d:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 2751
    .line 2752
    move/from16 v23, v5

    .line 2753
    .line 2754
    iget-object v5, v12, Lol2;->e:Llv1;

    .line 2755
    .line 2756
    move-object/from16 v28, v5

    .line 2757
    .line 2758
    iget-object v5, v12, Lol2;->h:Llv1;

    .line 2759
    .line 2760
    move-object/from16 v29, v5

    .line 2761
    .line 2762
    iget-object v5, v12, Lol2;->i:Llv1;

    .line 2763
    .line 2764
    move-object/from16 v30, v5

    .line 2765
    .line 2766
    iget-object v5, v12, Lol2;->j:Llv1;

    .line 2767
    .line 2768
    move-object/from16 v31, v5

    .line 2769
    .line 2770
    iget-object v5, v12, Lol2;->k:Llv1;

    .line 2771
    .line 2772
    move-object/from16 v32, v5

    .line 2773
    .line 2774
    iget-object v5, v12, Lol2;->f:Llv1;

    .line 2775
    .line 2776
    move-object/from16 v33, v5

    .line 2777
    .line 2778
    iget-object v5, v12, Lol2;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 2779
    .line 2780
    move-object/from16 v48, v6

    .line 2781
    .line 2782
    iget-object v6, v5, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 2783
    .line 2784
    iget-object v6, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->l:Ljava/lang/String;

    .line 2785
    .line 2786
    move-object/from16 v39, v8

    .line 2787
    .line 2788
    iget-object v8, v12, Lol2;->b:Lac1;

    .line 2789
    .line 2790
    move-object/from16 v49, v0

    .line 2791
    .line 2792
    iget-object v0, v8, Lac1;->b:Ljava/lang/Object;

    .line 2793
    .line 2794
    check-cast v0, Ljava/lang/String;

    .line 2795
    .line 2796
    invoke-static {v6}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 2797
    .line 2798
    .line 2799
    move-result v34

    .line 2800
    if-nez v34, :cond_62

    .line 2801
    .line 2802
    invoke-static {v0}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 2803
    .line 2804
    .line 2805
    move-result v34

    .line 2806
    if-nez v34, :cond_62

    .line 2807
    .line 2808
    const/16 v34, 0x1

    .line 2809
    .line 2810
    :goto_48
    move-object/from16 v50, v7

    .line 2811
    .line 2812
    goto :goto_49

    .line 2813
    :cond_62
    const/16 v34, 0x0

    .line 2814
    .line 2815
    goto :goto_48

    .line 2816
    :goto_49
    iget-object v7, v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->t:Ljava/lang/Boolean;

    .line 2817
    .line 2818
    move-object/from16 v51, v1

    .line 2819
    .line 2820
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2821
    .line 2822
    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2823
    .line 2824
    .line 2825
    move-result v1

    .line 2826
    if-eqz v1, :cond_63

    .line 2827
    .line 2828
    if-eqz v34, :cond_63

    .line 2829
    .line 2830
    new-instance v1, Llv1;

    .line 2831
    .line 2832
    new-instance v7, Lrv1;

    .line 2833
    .line 2834
    invoke-direct {v7, v0}, Lrv1;-><init>(Ljava/lang/String;)V

    .line 2835
    .line 2836
    .line 2837
    invoke-direct {v1, v6, v7}, Llv1;-><init>(Ljava/lang/String;Lw11;)V

    .line 2838
    .line 2839
    .line 2840
    move-object/from16 v34, v1

    .line 2841
    .line 2842
    goto :goto_4a

    .line 2843
    :cond_63
    const/16 v34, 0x0

    .line 2844
    .line 2845
    :goto_4a
    invoke-static {v4, v5}, Lk50;->x(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;)Lcom/usercentrics/tcf/core/model/gvl/VendorUrl;

    .line 2846
    .line 2847
    .line 2848
    move-result-object v0

    .line 2849
    if-eqz v0, :cond_65

    .line 2850
    .line 2851
    iget-object v0, v0, Lcom/usercentrics/tcf/core/model/gvl/VendorUrl;->b:Ljava/lang/String;

    .line 2852
    .line 2853
    if-nez v0, :cond_64

    .line 2854
    .line 2855
    goto :goto_4b

    .line 2856
    :cond_64
    new-instance v1, Llv1;

    .line 2857
    .line 2858
    iget-object v6, v5, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 2859
    .line 2860
    iget-object v6, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->D:Ljava/lang/String;

    .line 2861
    .line 2862
    new-instance v7, Lzu1;

    .line 2863
    .line 2864
    invoke-direct {v7, v0}, Lzu1;-><init>(Ljava/lang/String;)V

    .line 2865
    .line 2866
    .line 2867
    invoke-direct {v1, v6, v7}, Llv1;-><init>(Ljava/lang/String;Lw11;)V

    .line 2868
    .line 2869
    .line 2870
    move-object/from16 v35, v1

    .line 2871
    .line 2872
    goto :goto_4c

    .line 2873
    :cond_65
    :goto_4b
    const/16 v35, 0x0

    .line 2874
    .line 2875
    :goto_4c
    invoke-static {v4, v5}, Lk50;->x(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;)Lcom/usercentrics/tcf/core/model/gvl/VendorUrl;

    .line 2876
    .line 2877
    .line 2878
    move-result-object v0

    .line 2879
    if-eqz v0, :cond_67

    .line 2880
    .line 2881
    iget-object v0, v0, Lcom/usercentrics/tcf/core/model/gvl/VendorUrl;->c:Ljava/lang/String;

    .line 2882
    .line 2883
    if-nez v0, :cond_66

    .line 2884
    .line 2885
    goto :goto_4d

    .line 2886
    :cond_66
    new-instance v1, Llv1;

    .line 2887
    .line 2888
    invoke-virtual {v12}, Lol2;->b()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 2889
    .line 2890
    .line 2891
    move-result-object v5

    .line 2892
    iget-object v5, v5, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->D:Ljava/lang/String;

    .line 2893
    .line 2894
    new-instance v6, Lzu1;

    .line 2895
    .line 2896
    invoke-direct {v6, v0}, Lzu1;-><init>(Ljava/lang/String;)V

    .line 2897
    .line 2898
    .line 2899
    invoke-direct {v1, v5, v6}, Llv1;-><init>(Ljava/lang/String;Lw11;)V

    .line 2900
    .line 2901
    .line 2902
    move-object/from16 v36, v1

    .line 2903
    .line 2904
    goto :goto_4e

    .line 2905
    :cond_67
    :goto_4d
    const/16 v36, 0x0

    .line 2906
    .line 2907
    :goto_4e
    new-instance v0, Lzr3;

    .line 2908
    .line 2909
    new-instance v40, Liy;

    .line 2910
    .line 2911
    iget-object v1, v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->o:Ljava/lang/Double;

    .line 2912
    .line 2913
    if-eqz v1, :cond_68

    .line 2914
    .line 2915
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 2916
    .line 2917
    .line 2918
    move-result-wide v5

    .line 2919
    double-to-long v5, v5

    .line 2920
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2921
    .line 2922
    .line 2923
    move-result-object v1

    .line 2924
    move-object/from16 v41, v1

    .line 2925
    .line 2926
    goto :goto_4f

    .line 2927
    :cond_68
    const/16 v41, 0x0

    .line 2928
    .line 2929
    :goto_4f
    iget-boolean v1, v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->p:Z

    .line 2930
    .line 2931
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2932
    .line 2933
    .line 2934
    move-result-object v42

    .line 2935
    iget-object v1, v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->q:Ljava/lang/String;

    .line 2936
    .line 2937
    iget-boolean v5, v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->r:Z

    .line 2938
    .line 2939
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2940
    .line 2941
    .line 2942
    move-result-object v45

    .line 2943
    iget-object v4, v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->s:Ljava/lang/Boolean;

    .line 2944
    .line 2945
    iget-object v5, v8, Lac1;->d:Ljava/lang/Object;

    .line 2946
    .line 2947
    move-object/from16 v47, v5

    .line 2948
    .line 2949
    check-cast v47, Lhu1;

    .line 2950
    .line 2951
    const/16 v44, 0x0

    .line 2952
    .line 2953
    move-object/from16 v43, v1

    .line 2954
    .line 2955
    move-object/from16 v46, v4

    .line 2956
    .line 2957
    invoke-direct/range {v40 .. v47}, Liy;-><init>(Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;Ljava/lang/Boolean;Ljava/lang/Boolean;Lhu1;)V

    .line 2958
    .line 2959
    .line 2960
    move-object/from16 v1, v40

    .line 2961
    .line 2962
    const/16 v4, 0x8

    .line 2963
    .line 2964
    const/4 v5, 0x0

    .line 2965
    invoke-direct {v0, v4, v1, v5}, Lzr3;-><init>(ILjava/lang/Object;Z)V

    .line 2966
    .line 2967
    .line 2968
    invoke-virtual {v0}, Lzr3;->k()Llv1;

    .line 2969
    .line 2970
    .line 2971
    move-result-object v37

    .line 2972
    iget-object v0, v12, Lol2;->g:Llv1;

    .line 2973
    .line 2974
    move-object/from16 v38, v0

    .line 2975
    .line 2976
    filled-new-array/range {v28 .. v38}, [Llv1;

    .line 2977
    .line 2978
    .line 2979
    move-result-object v0

    .line 2980
    invoke-static {v0}, Lqd;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 2981
    .line 2982
    .line 2983
    move-result-object v30

    .line 2984
    const/16 v46, 0x0

    .line 2985
    .line 2986
    const v47, 0x7fffa

    .line 2987
    .line 2988
    .line 2989
    const/16 v29, 0x0

    .line 2990
    .line 2991
    const/16 v31, 0x0

    .line 2992
    .line 2993
    const/16 v32, 0x0

    .line 2994
    .line 2995
    const/16 v33, 0x0

    .line 2996
    .line 2997
    const/16 v34, 0x0

    .line 2998
    .line 2999
    const/16 v35, 0x0

    .line 3000
    .line 3001
    const/16 v36, 0x0

    .line 3002
    .line 3003
    const/16 v37, 0x0

    .line 3004
    .line 3005
    const/16 v38, 0x0

    .line 3006
    .line 3007
    move-object/from16 v28, v39

    .line 3008
    .line 3009
    const/16 v39, 0x0

    .line 3010
    .line 3011
    const/16 v40, 0x0

    .line 3012
    .line 3013
    const/16 v41, 0x0

    .line 3014
    .line 3015
    const/16 v42, 0x0

    .line 3016
    .line 3017
    const/16 v43, 0x0

    .line 3018
    .line 3019
    const/16 v45, 0x0

    .line 3020
    .line 3021
    invoke-direct/range {v27 .. v47}, Lmv1;-><init>(Ljava/lang/String;Lvv1;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/List;Lmu1;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lhv1;Ljava/lang/String;Ljava/util/List;Law1;Ljava/lang/String;Lkv1;Llv1;Lq90;Ljava/util/List;ZI)V

    .line 3022
    .line 3023
    .line 3024
    move-object/from16 v0, v27

    .line 3025
    .line 3026
    invoke-direct {v15, v0}, Lsv1;-><init>(Lmv1;)V

    .line 3027
    .line 3028
    .line 3029
    if-eqz v23, :cond_69

    .line 3030
    .line 3031
    invoke-virtual {v10, v13}, Ldl2;->A(Lcl2;)Ljava/util/ArrayList;

    .line 3032
    .line 3033
    .line 3034
    move-result-object v0

    .line 3035
    goto :goto_50

    .line 3036
    :cond_69
    const/4 v0, 0x0

    .line 3037
    :goto_50
    invoke-direct {v14, v13, v15, v0}, Lcu1;-><init>(Lcl2;Lpg3;Ljava/util/ArrayList;)V

    .line 3038
    .line 3039
    .line 3040
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3041
    .line 3042
    .line 3043
    move-object/from16 v4, v22

    .line 3044
    .line 3045
    move/from16 v5, v23

    .line 3046
    .line 3047
    move-object/from16 v6, v48

    .line 3048
    .line 3049
    move-object/from16 v0, v49

    .line 3050
    .line 3051
    move-object/from16 v7, v50

    .line 3052
    .line 3053
    move-object/from16 v1, v51

    .line 3054
    .line 3055
    goto/16 :goto_47

    .line 3056
    .line 3057
    :cond_6a
    move-object/from16 v49, v0

    .line 3058
    .line 3059
    move-object/from16 v51, v1

    .line 3060
    .line 3061
    move-object/from16 v22, v4

    .line 3062
    .line 3063
    move/from16 v23, v5

    .line 3064
    .line 3065
    move-object/from16 v50, v7

    .line 3066
    .line 3067
    new-instance v0, Ldu1;

    .line 3068
    .line 3069
    iget-object v1, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->f:Ljava/lang/String;

    .line 3070
    .line 3071
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 3072
    .line 3073
    .line 3074
    move-result v4

    .line 3075
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 3076
    .line 3077
    .line 3078
    move-result-object v4

    .line 3079
    invoke-static {v1, v4}, Ldl2;->B(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3080
    .line 3081
    .line 3082
    move-result-object v1

    .line 3083
    invoke-direct {v0, v1, v11}, Ldu1;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 3084
    .line 3085
    .line 3086
    move-object v11, v0

    .line 3087
    :goto_51
    if-eqz v11, :cond_6b

    .line 3088
    .line 3089
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3090
    .line 3091
    .line 3092
    :cond_6b
    invoke-interface/range {v22 .. v22}, Ljava/util/List;->isEmpty()Z

    .line 3093
    .line 3094
    .line 3095
    move-result v0

    .line 3096
    if-eqz v0, :cond_6c

    .line 3097
    .line 3098
    const/4 v11, 0x0

    .line 3099
    goto/16 :goto_57

    .line 3100
    .line 3101
    :cond_6c
    new-instance v0, Ljava/util/ArrayList;

    .line 3102
    .line 3103
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3104
    .line 3105
    .line 3106
    invoke-interface/range {v22 .. v22}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3107
    .line 3108
    .line 3109
    move-result-object v1

    .line 3110
    :cond_6d
    :goto_52
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 3111
    .line 3112
    .line 3113
    move-result v4

    .line 3114
    if-eqz v4, :cond_6e

    .line 3115
    .line 3116
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3117
    .line 3118
    .line 3119
    move-result-object v4

    .line 3120
    move-object v5, v4

    .line 3121
    check-cast v5, Lm61;

    .line 3122
    .line 3123
    iget-boolean v5, v5, Lm61;->y:Z

    .line 3124
    .line 3125
    if-nez v5, :cond_6d

    .line 3126
    .line 3127
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3128
    .line 3129
    .line 3130
    goto :goto_52

    .line 3131
    :cond_6e
    new-instance v1, Ljava/util/ArrayList;

    .line 3132
    .line 3133
    const/16 v14, 0xa

    .line 3134
    .line 3135
    invoke-static {v0, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 3136
    .line 3137
    .line 3138
    move-result v4

    .line 3139
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 3140
    .line 3141
    .line 3142
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 3143
    .line 3144
    .line 3145
    move-result-object v0

    .line 3146
    :goto_53
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3147
    .line 3148
    .line 3149
    move-result v4

    .line 3150
    if-eqz v4, :cond_71

    .line 3151
    .line 3152
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3153
    .line 3154
    .line 3155
    move-result-object v4

    .line 3156
    check-cast v4, Lm61;

    .line 3157
    .line 3158
    new-instance v5, Lsv1;

    .line 3159
    .line 3160
    new-instance v27, Lmv1;

    .line 3161
    .line 3162
    iget-object v6, v4, Lm61;->v:Ljava/lang/Boolean;

    .line 3163
    .line 3164
    if-nez v6, :cond_6f

    .line 3165
    .line 3166
    iget-object v7, v4, Lm61;->u:Ljava/lang/Long;

    .line 3167
    .line 3168
    if-nez v7, :cond_6f

    .line 3169
    .line 3170
    const/16 v8, 0x8

    .line 3171
    .line 3172
    const/16 v29, 0x0

    .line 3173
    .line 3174
    :goto_54
    move-object/from16 v6, v51

    .line 3175
    .line 3176
    goto :goto_55

    .line 3177
    :cond_6f
    new-instance v7, Lzr3;

    .line 3178
    .line 3179
    new-instance v28, Liy;

    .line 3180
    .line 3181
    iget-object v8, v4, Lm61;->u:Ljava/lang/Long;

    .line 3182
    .line 3183
    iget-object v11, v4, Lm61;->w:Ljava/lang/String;

    .line 3184
    .line 3185
    iget-object v12, v4, Lm61;->x:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;

    .line 3186
    .line 3187
    iget-object v13, v9, Lac1;->d:Ljava/lang/Object;

    .line 3188
    .line 3189
    move-object/from16 v35, v13

    .line 3190
    .line 3191
    check-cast v35, Lhu1;

    .line 3192
    .line 3193
    const/16 v33, 0x0

    .line 3194
    .line 3195
    const/16 v34, 0x0

    .line 3196
    .line 3197
    move-object/from16 v30, v6

    .line 3198
    .line 3199
    move-object/from16 v29, v8

    .line 3200
    .line 3201
    move-object/from16 v31, v11

    .line 3202
    .line 3203
    move-object/from16 v32, v12

    .line 3204
    .line 3205
    invoke-direct/range {v28 .. v35}, Liy;-><init>(Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;Ljava/lang/Boolean;Ljava/lang/Boolean;Lhu1;)V

    .line 3206
    .line 3207
    .line 3208
    move-object/from16 v6, v28

    .line 3209
    .line 3210
    const/16 v8, 0x8

    .line 3211
    .line 3212
    const/4 v11, 0x1

    .line 3213
    invoke-direct {v7, v8, v6, v11}, Lzr3;-><init>(ILjava/lang/Object;Z)V

    .line 3214
    .line 3215
    .line 3216
    invoke-virtual {v7}, Lzr3;->k()Llv1;

    .line 3217
    .line 3218
    .line 3219
    move-result-object v11

    .line 3220
    move-object/from16 v29, v11

    .line 3221
    .line 3222
    goto :goto_54

    .line 3223
    :goto_55
    iget-object v7, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->B:Lq90;

    .line 3224
    .line 3225
    iget-object v11, v4, Lm61;->p:Li61;

    .line 3226
    .line 3227
    invoke-virtual {v10, v11}, Lsq3;->l(Li61;)Lkv1;

    .line 3228
    .line 3229
    .line 3230
    move-result-object v32

    .line 3231
    const/16 v33, 0x4

    .line 3232
    .line 3233
    const/16 v30, 0x0

    .line 3234
    .line 3235
    move-object/from16 v28, v4

    .line 3236
    .line 3237
    move-object/from16 v31, v7

    .line 3238
    .line 3239
    invoke-direct/range {v27 .. v33}, Lmv1;-><init>(Lm61;Llv1;ZLq90;Lkv1;I)V

    .line 3240
    .line 3241
    .line 3242
    move-object/from16 v7, v27

    .line 3243
    .line 3244
    invoke-direct {v5, v7}, Lsv1;-><init>(Lmv1;)V

    .line 3245
    .line 3246
    .line 3247
    if-eqz v23, :cond_70

    .line 3248
    .line 3249
    new-instance v11, Lvv1;

    .line 3250
    .line 3251
    iget-boolean v7, v4, Lm61;->q:Z

    .line 3252
    .line 3253
    iget-object v12, v4, Lm61;->p:Li61;

    .line 3254
    .line 3255
    iget-boolean v12, v12, Li61;->b:Z

    .line 3256
    .line 3257
    invoke-direct {v11, v7, v12}, Lvv1;-><init>(ZZ)V

    .line 3258
    .line 3259
    .line 3260
    goto :goto_56

    .line 3261
    :cond_70
    const/4 v11, 0x0

    .line 3262
    :goto_56
    new-instance v7, Lcu1;

    .line 3263
    .line 3264
    invoke-direct {v7, v4, v11, v5}, Lcu1;-><init>(Lm61;Lvv1;Lsv1;)V

    .line 3265
    .line 3266
    .line 3267
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3268
    .line 3269
    .line 3270
    move-object/from16 v51, v6

    .line 3271
    .line 3272
    goto :goto_53

    .line 3273
    :cond_71
    new-instance v11, Ldu1;

    .line 3274
    .line 3275
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->h:Ljava/lang/String;

    .line 3276
    .line 3277
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 3278
    .line 3279
    .line 3280
    move-result v4

    .line 3281
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 3282
    .line 3283
    .line 3284
    move-result-object v4

    .line 3285
    invoke-static {v0, v4}, Ldl2;->B(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3286
    .line 3287
    .line 3288
    move-result-object v0

    .line 3289
    invoke-direct {v11, v0, v1}, Ldu1;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 3290
    .line 3291
    .line 3292
    :goto_57
    if-eqz v11, :cond_72

    .line 3293
    .line 3294
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3295
    .line 3296
    .line 3297
    :cond_72
    iget-object v0, v10, Ldl2;->U:Ljava/util/List;

    .line 3298
    .line 3299
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 3300
    .line 3301
    .line 3302
    move-result v1

    .line 3303
    if-eqz v1, :cond_73

    .line 3304
    .line 3305
    move-object/from16 v9, v17

    .line 3306
    .line 3307
    const/4 v2, 0x0

    .line 3308
    goto/16 :goto_5a

    .line 3309
    .line 3310
    :cond_73
    new-instance v1, Ljava/util/ArrayList;

    .line 3311
    .line 3312
    const/16 v14, 0xa

    .line 3313
    .line 3314
    invoke-static {v0, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 3315
    .line 3316
    .line 3317
    move-result v4

    .line 3318
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 3319
    .line 3320
    .line 3321
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3322
    .line 3323
    .line 3324
    move-result-object v0

    .line 3325
    :goto_58
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3326
    .line 3327
    .line 3328
    move-result v4

    .line 3329
    if-eqz v4, :cond_74

    .line 3330
    .line 3331
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3332
    .line 3333
    .line 3334
    move-result-object v4

    .line 3335
    check-cast v4, Lcom/usercentrics/sdk/AdTechProvider;

    .line 3336
    .line 3337
    sget-object v5, Lya2;->Companion:Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;

    .line 3338
    .line 3339
    invoke-virtual {v5, v4}, Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;->id(Lcom/usercentrics/sdk/AdTechProvider;)Ljava/lang/String;

    .line 3340
    .line 3341
    .line 3342
    move-result-object v28

    .line 3343
    iget-object v6, v4, Lcom/usercentrics/sdk/AdTechProvider;->b:Ljava/lang/String;

    .line 3344
    .line 3345
    new-instance v7, Lsv1;

    .line 3346
    .line 3347
    new-instance v51, Lmv1;

    .line 3348
    .line 3349
    invoke-virtual {v5, v4}, Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;->id(Lcom/usercentrics/sdk/AdTechProvider;)Ljava/lang/String;

    .line 3350
    .line 3351
    .line 3352
    move-result-object v52

    .line 3353
    new-instance v5, Law1;

    .line 3354
    .line 3355
    iget-object v8, v4, Lcom/usercentrics/sdk/AdTechProvider;->c:Ljava/lang/String;

    .line 3356
    .line 3357
    move-object/from16 v9, v17

    .line 3358
    .line 3359
    invoke-direct {v5, v9, v9, v9, v8}, Law1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3360
    .line 3361
    .line 3362
    const/16 v70, 0x0

    .line 3363
    .line 3364
    const v71, 0x7effe

    .line 3365
    .line 3366
    .line 3367
    const/16 v53, 0x0

    .line 3368
    .line 3369
    const/16 v54, 0x0

    .line 3370
    .line 3371
    const/16 v55, 0x0

    .line 3372
    .line 3373
    const/16 v56, 0x0

    .line 3374
    .line 3375
    const/16 v57, 0x0

    .line 3376
    .line 3377
    const/16 v58, 0x0

    .line 3378
    .line 3379
    const/16 v59, 0x0

    .line 3380
    .line 3381
    const/16 v60, 0x0

    .line 3382
    .line 3383
    const/16 v61, 0x0

    .line 3384
    .line 3385
    const/16 v62, 0x0

    .line 3386
    .line 3387
    const/16 v63, 0x0

    .line 3388
    .line 3389
    const/16 v65, 0x0

    .line 3390
    .line 3391
    const/16 v66, 0x0

    .line 3392
    .line 3393
    const/16 v67, 0x0

    .line 3394
    .line 3395
    const/16 v68, 0x0

    .line 3396
    .line 3397
    const/16 v69, 0x0

    .line 3398
    .line 3399
    move-object/from16 v64, v5

    .line 3400
    .line 3401
    invoke-direct/range {v51 .. v71}, Lmv1;-><init>(Ljava/lang/String;Lvv1;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/List;Lmu1;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lhv1;Ljava/lang/String;Ljava/util/List;Law1;Ljava/lang/String;Lkv1;Llv1;Lq90;Ljava/util/List;ZI)V

    .line 3402
    .line 3403
    .line 3404
    move-object/from16 v5, v51

    .line 3405
    .line 3406
    invoke-direct {v7, v5}, Lsv1;-><init>(Lmv1;)V

    .line 3407
    .line 3408
    .line 3409
    new-instance v5, Lvv1;

    .line 3410
    .line 3411
    iget-boolean v4, v4, Lcom/usercentrics/sdk/AdTechProvider;->d:Z

    .line 3412
    .line 3413
    const/4 v14, 0x0

    .line 3414
    invoke-direct {v5, v14, v4}, Lvv1;-><init>(ZZ)V

    .line 3415
    .line 3416
    .line 3417
    new-instance v27, Lcu1;

    .line 3418
    .line 3419
    const/16 v33, 0x0

    .line 3420
    .line 3421
    const/16 v34, 0x60

    .line 3422
    .line 3423
    const-string v30, ""

    .line 3424
    .line 3425
    move-object/from16 v31, v5

    .line 3426
    .line 3427
    move-object/from16 v29, v6

    .line 3428
    .line 3429
    move-object/from16 v32, v7

    .line 3430
    .line 3431
    invoke-direct/range {v27 .. v34}, Lcu1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvv1;Lpg3;Ljava/util/List;I)V

    .line 3432
    .line 3433
    .line 3434
    move-object/from16 v4, v27

    .line 3435
    .line 3436
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3437
    .line 3438
    .line 3439
    goto :goto_58

    .line 3440
    :cond_74
    move-object/from16 v9, v17

    .line 3441
    .line 3442
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->j0:Ljava/lang/String;

    .line 3443
    .line 3444
    if-eqz v0, :cond_75

    .line 3445
    .line 3446
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 3447
    .line 3448
    .line 3449
    move-result v2

    .line 3450
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 3451
    .line 3452
    .line 3453
    move-result-object v2

    .line 3454
    invoke-static {v0, v2}, Ldl2;->B(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3455
    .line 3456
    .line 3457
    move-result-object v0

    .line 3458
    goto :goto_59

    .line 3459
    :cond_75
    const/4 v0, 0x0

    .line 3460
    :goto_59
    new-instance v2, Ldu1;

    .line 3461
    .line 3462
    invoke-direct {v2, v0, v1}, Ldu1;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 3463
    .line 3464
    .line 3465
    :goto_5a
    if-eqz v2, :cond_76

    .line 3466
    .line 3467
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3468
    .line 3469
    .line 3470
    :cond_76
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->z(Ljava/util/List;)Ljava/lang/Object;

    .line 3471
    .line 3472
    .line 3473
    move-result-object v0

    .line 3474
    check-cast v0, Ldu1;

    .line 3475
    .line 3476
    if-eqz v0, :cond_77

    .line 3477
    .line 3478
    iget-object v1, v0, Ldu1;->b:Ljava/util/List;

    .line 3479
    .line 3480
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->M(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 3481
    .line 3482
    .line 3483
    move-result-object v1

    .line 3484
    new-instance v27, Lcu1;

    .line 3485
    .line 3486
    iget-object v2, v10, Ldl2;->d:Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;

    .line 3487
    .line 3488
    iget-object v4, v2, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->a:Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;

    .line 3489
    .line 3490
    iget-object v5, v4, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->h:Ljava/lang/String;

    .line 3491
    .line 3492
    new-instance v6, Lqv1;

    .line 3493
    .line 3494
    iget-object v4, v4, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->g:Ljava/lang/String;

    .line 3495
    .line 3496
    invoke-direct {v6, v9, v4, v9}, Lqv1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3497
    .line 3498
    .line 3499
    const/16 v33, 0x0

    .line 3500
    .line 3501
    const/16 v34, 0x0

    .line 3502
    .line 3503
    const-string v28, ""

    .line 3504
    .line 3505
    const/16 v30, 0x0

    .line 3506
    .line 3507
    const/16 v31, 0x0

    .line 3508
    .line 3509
    move-object/from16 v29, v5

    .line 3510
    .line 3511
    move-object/from16 v32, v6

    .line 3512
    .line 3513
    invoke-direct/range {v27 .. v34}, Lcu1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvv1;Lpg3;Ljava/util/List;Ljava/util/List;)V

    .line 3514
    .line 3515
    .line 3516
    move-object/from16 v4, v27

    .line 3517
    .line 3518
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3519
    .line 3520
    .line 3521
    new-instance v4, Lfu1;

    .line 3522
    .line 3523
    iget-object v2, v2, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->a:Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;

    .line 3524
    .line 3525
    iget-object v2, v2, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->f:Ljava/lang/String;

    .line 3526
    .line 3527
    iget-object v5, v10, Ldl2;->w:Ljava/lang/String;

    .line 3528
    .line 3529
    invoke-direct {v4, v2, v5}, Lfu1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 3530
    .line 3531
    .line 3532
    iget-object v0, v0, Ldu1;->a:Ljava/lang/String;

    .line 3533
    .line 3534
    new-instance v2, Ldu1;

    .line 3535
    .line 3536
    invoke-direct {v2, v0, v1, v4}, Ldu1;-><init>(Ljava/lang/String;Ljava/util/List;Lfu1;)V

    .line 3537
    .line 3538
    .line 3539
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 3540
    .line 3541
    .line 3542
    move-result v0

    .line 3543
    const/16 v25, 0x1

    .line 3544
    .line 3545
    add-int/lit8 v0, v0, -0x1

    .line 3546
    .line 3547
    invoke-virtual {v3, v0, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 3548
    .line 3549
    .line 3550
    :cond_77
    new-instance v0, Lxv1;

    .line 3551
    .line 3552
    new-instance v1, Lpv1;

    .line 3553
    .line 3554
    invoke-direct {v1, v3}, Lpv1;-><init>(Ljava/util/List;)V

    .line 3555
    .line 3556
    .line 3557
    move-object/from16 v2, v50

    .line 3558
    .line 3559
    invoke-direct {v0, v2, v1}, Lxv1;-><init>(Ljava/lang/String;Lwv1;)V

    .line 3560
    .line 3561
    .line 3562
    move-object/from16 v1, v49

    .line 3563
    .line 3564
    filled-new-array {v1, v0}, [Lxv1;

    .line 3565
    .line 3566
    .line 3567
    move-result-object v0

    .line 3568
    invoke-static {v0}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 3569
    .line 3570
    .line 3571
    move-result-object v0

    .line 3572
    move-object/from16 v1, v20

    .line 3573
    .line 3574
    move-object/from16 v2, v21

    .line 3575
    .line 3576
    move-object/from16 v3, v26

    .line 3577
    .line 3578
    invoke-direct {v1, v3, v2, v0}, Lac1;-><init>(Lqi1;Lij;Ljava/util/List;)V

    .line 3579
    .line 3580
    .line 3581
    move-object/from16 v2, p0

    .line 3582
    .line 3583
    move-object/from16 v0, p1

    .line 3584
    .line 3585
    move-object/from16 v3, v16

    .line 3586
    .line 3587
    move-object/from16 v14, v24

    .line 3588
    .line 3589
    invoke-direct {v0, v14, v2, v3, v1}, Ldw1;-><init>(Lur3;Lra2;Ljw2;Lac1;)V

    .line 3590
    .line 3591
    .line 3592
    move-object v9, v0

    .line 3593
    goto/16 :goto_5c

    .line 3594
    .line 3595
    :cond_78
    invoke-static {}, Lds0;->b()V

    .line 3596
    .line 3597
    .line 3598
    const/4 v9, 0x0

    .line 3599
    goto/16 :goto_5c

    .line 3600
    .line 3601
    :cond_79
    const/4 v14, 0x0

    .line 3602
    iget-object v2, v6, Lac2;->c:Lk61;

    .line 3603
    .line 3604
    new-instance v15, Lfm;

    .line 3605
    .line 3606
    iget-object v3, v5, Lpc2;->d:Lkn1;

    .line 3607
    .line 3608
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3609
    .line 3610
    .line 3611
    iget-object v3, v3, Lkn1;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 3612
    .line 3613
    iget-object v5, v4, Lk61;->j:Lec;

    .line 3614
    .line 3615
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3616
    .line 3617
    .line 3618
    iget-object v5, v5, Lec;->b:Ljava/lang/Object;

    .line 3619
    .line 3620
    move-object/from16 v17, v5

    .line 3621
    .line 3622
    check-cast v17, Lur3;

    .line 3623
    .line 3624
    iget-object v5, v4, Lk61;->j:Lec;

    .line 3625
    .line 3626
    iget-object v5, v5, Lec;->d:Ljava/lang/Object;

    .line 3627
    .line 3628
    move-object/from16 v18, v5

    .line 3629
    .line 3630
    check-cast v18, Lec;

    .line 3631
    .line 3632
    iget-object v4, v4, Lk61;->e:Ljava/lang/String;

    .line 3633
    .line 3634
    iget-object v5, v2, Lk61;->a:Ljava/util/List;

    .line 3635
    .line 3636
    iget-object v2, v2, Lk61;->b:Ljava/util/List;

    .line 3637
    .line 3638
    iget-object v0, v0, Lth;->e:Lyr;

    .line 3639
    .line 3640
    invoke-virtual {v0}, Lyr;->a()Lcom/usercentrics/ccpa/CCPAData;

    .line 3641
    .line 3642
    .line 3643
    move-result-object v0

    .line 3644
    iget-object v0, v0, Lcom/usercentrics/ccpa/CCPAData;->c:Ljava/lang/Boolean;

    .line 3645
    .line 3646
    if-eqz v0, :cond_7a

    .line 3647
    .line 3648
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3649
    .line 3650
    .line 3651
    move-result v0

    .line 3652
    move/from16 v22, v0

    .line 3653
    .line 3654
    goto :goto_5b

    .line 3655
    :cond_7a
    move/from16 v22, v14

    .line 3656
    .line 3657
    :goto_5b
    iget-object v0, v1, Lsr2;->b:Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;

    .line 3658
    .line 3659
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3660
    .line 3661
    .line 3662
    move-object/from16 v23, v0

    .line 3663
    .line 3664
    move-object/from16 v21, v2

    .line 3665
    .line 3666
    move-object/from16 v16, v3

    .line 3667
    .line 3668
    move-object/from16 v19, v4

    .line 3669
    .line 3670
    move-object/from16 v20, v5

    .line 3671
    .line 3672
    invoke-direct/range {v15 .. v23}, Lfm;-><init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lur3;Lec;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;)V

    .line 3673
    .line 3674
    .line 3675
    invoke-virtual {v15}, Lfm;->a()Ldw1;

    .line 3676
    .line 3677
    .line 3678
    move-result-object v9

    .line 3679
    goto :goto_5c

    .line 3680
    :cond_7b
    iget-object v0, v6, Lac2;->c:Lk61;

    .line 3681
    .line 3682
    new-instance v6, Lb5;

    .line 3683
    .line 3684
    iget-object v2, v5, Lpc2;->d:Lkn1;

    .line 3685
    .line 3686
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3687
    .line 3688
    .line 3689
    iget-object v7, v2, Lkn1;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 3690
    .line 3691
    iget-object v2, v4, Lk61;->j:Lec;

    .line 3692
    .line 3693
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3694
    .line 3695
    .line 3696
    iget-object v2, v2, Lec;->b:Ljava/lang/Object;

    .line 3697
    .line 3698
    move-object v8, v2

    .line 3699
    check-cast v8, Lur3;

    .line 3700
    .line 3701
    iget-object v2, v4, Lk61;->j:Lec;

    .line 3702
    .line 3703
    iget-object v2, v2, Lec;->d:Ljava/lang/Object;

    .line 3704
    .line 3705
    move-object v9, v2

    .line 3706
    check-cast v9, Lec;

    .line 3707
    .line 3708
    iget-object v10, v1, Lsr2;->b:Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;

    .line 3709
    .line 3710
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3711
    .line 3712
    .line 3713
    iget-object v11, v4, Lk61;->e:Ljava/lang/String;

    .line 3714
    .line 3715
    iget-object v12, v0, Lk61;->a:Ljava/util/List;

    .line 3716
    .line 3717
    iget-object v13, v0, Lk61;->b:Ljava/util/List;

    .line 3718
    .line 3719
    invoke-direct/range {v6 .. v13}, Lb5;-><init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lur3;Lec;Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 3720
    .line 3721
    .line 3722
    invoke-virtual {v6}, Lb5;->y()Ldw1;

    .line 3723
    .line 3724
    .line 3725
    move-result-object v9

    .line 3726
    :goto_5c
    return-object v9

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
