.class public abstract Lv82;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Lu82;

.field public static final a:Ld52;


# direct methods
.method static constructor <clinit>()V
    .locals 23

    .line 1
    new-instance v0, Lu82;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lv82;->Companion:Lu82;

    .line 7
    .line 8
    new-instance v0, Ld52;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lfs0;

    .line 14
    .line 15
    sget-object v2, Lt82;->b:Lt82;

    .line 16
    .line 17
    sget-object v3, Lih0;->a:[Lih0;

    .line 18
    .line 19
    const-string v21, "vendorLegitimateInterests"

    .line 20
    .line 21
    const-string v22, "publisherRestrictions"

    .line 22
    .line 23
    const-string v4, "version"

    .line 24
    .line 25
    const-string v5, "created"

    .line 26
    .line 27
    const-string v6, "lastUpdated"

    .line 28
    .line 29
    const-string v7, "cmpId"

    .line 30
    .line 31
    const-string v8, "cmpVersion"

    .line 32
    .line 33
    const-string v9, "consentScreen"

    .line 34
    .line 35
    const-string v10, "consentLanguage"

    .line 36
    .line 37
    const-string v11, "vendorListVersion"

    .line 38
    .line 39
    const-string v12, "policyVersion"

    .line 40
    .line 41
    const-string v13, "isServiceSpecific"

    .line 42
    .line 43
    const-string v14, "useNonStandardStacks"

    .line 44
    .line 45
    const-string v15, "specialFeatureOptins"

    .line 46
    .line 47
    const-string v16, "purposeConsents"

    .line 48
    .line 49
    const-string v17, "purposeLegitimateInterests"

    .line 50
    .line 51
    const-string v18, "purposeOneTreatment"

    .line 52
    .line 53
    const-string v19, "publisherCountryCode"

    .line 54
    .line 55
    const-string v20, "vendorConsents"

    .line 56
    .line 57
    filled-new-array/range {v4 .. v22}, [Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v3}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    new-instance v4, Lkotlin/Pair;

    .line 66
    .line 67
    invoke-direct {v4, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object v2, Lt82;->c:Lt82;

    .line 71
    .line 72
    const-string v3, "vendorsDisclosed"

    .line 73
    .line 74
    invoke-static {v3}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    new-instance v5, Lkotlin/Pair;

    .line 79
    .line 80
    invoke-direct {v5, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    sget-object v2, Lt82;->e:Lt82;

    .line 84
    .line 85
    const-string v3, "publisherCustomConsents"

    .line 86
    .line 87
    const-string v6, "publisherCustomLegitimateInterests"

    .line 88
    .line 89
    const-string v7, "publisherConsents"

    .line 90
    .line 91
    const-string v8, "publisherLegitimateInterests"

    .line 92
    .line 93
    const-string v9, "numCustomPurposes"

    .line 94
    .line 95
    filled-new-array {v7, v8, v9, v3, v6}, [Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-static {v3}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    new-instance v6, Lkotlin/Pair;

    .line 104
    .line 105
    invoke-direct {v6, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sget-object v2, Lt82;->d:Lt82;

    .line 109
    .line 110
    const-string v3, "vendorsAllowed"

    .line 111
    .line 112
    invoke-static {v3}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    new-instance v7, Lkotlin/Pair;

    .line 117
    .line 118
    invoke-direct {v7, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    filled-new-array {v4, v5, v6, v7}, [Lkotlin/Pair;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-static {v2}, Loc1;->e([Lkotlin/Pair;)Ljava/util/Map;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    const/16 v3, 0xd

    .line 130
    .line 131
    const/4 v4, 0x0

    .line 132
    invoke-direct {v1, v3, v4}, Lfs0;-><init>(IZ)V

    .line 133
    .line 134
    .line 135
    iput-object v2, v1, Lfs0;->b:Ljava/lang/Object;

    .line 136
    .line 137
    iput-object v1, v0, Ld52;->a:Ljava/lang/Object;

    .line 138
    .line 139
    sput-object v0, Lv82;->a:Ld52;

    .line 140
    .line 141
    return-void
.end method
