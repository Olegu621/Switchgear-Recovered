.class public abstract Lfz;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 51

    .line 1
    const-string v49, "ZH"

    .line 2
    .line 3
    const-string v50, "ZH-HANT"

    .line 4
    .line 5
    const-string v1, "AR"

    .line 6
    .line 7
    const-string v2, "BG"

    .line 8
    .line 9
    const-string v3, "BS"

    .line 10
    .line 11
    const-string v4, "CA"

    .line 12
    .line 13
    const-string v5, "CS"

    .line 14
    .line 15
    const-string v6, "CY"

    .line 16
    .line 17
    const-string v7, "DA"

    .line 18
    .line 19
    const-string v8, "DE"

    .line 20
    .line 21
    const-string v9, "EL"

    .line 22
    .line 23
    const-string v10, "EN"

    .line 24
    .line 25
    const-string v11, "ES"

    .line 26
    .line 27
    const-string v12, "ET"

    .line 28
    .line 29
    const-string v13, "EU"

    .line 30
    .line 31
    const-string v14, "FI"

    .line 32
    .line 33
    const-string v15, "FR"

    .line 34
    .line 35
    const-string v16, "GL"

    .line 36
    .line 37
    const-string v17, "HE"

    .line 38
    .line 39
    const-string v18, "HI"

    .line 40
    .line 41
    const-string v19, "HR"

    .line 42
    .line 43
    const-string v20, "HU"

    .line 44
    .line 45
    const-string v21, "ID"

    .line 46
    .line 47
    const-string v22, "IT"

    .line 48
    .line 49
    const-string v23, "JA"

    .line 50
    .line 51
    const-string v24, "KA"

    .line 52
    .line 53
    const-string v25, "KO"

    .line 54
    .line 55
    const-string v26, "LT"

    .line 56
    .line 57
    const-string v27, "LV"

    .line 58
    .line 59
    const-string v28, "MK"

    .line 60
    .line 61
    const-string v29, "MS"

    .line 62
    .line 63
    const-string v30, "MT"

    .line 64
    .line 65
    const-string v31, "NL"

    .line 66
    .line 67
    const-string v32, "NO"

    .line 68
    .line 69
    const-string v33, "PL"

    .line 70
    .line 71
    const-string v34, "PT"

    .line 72
    .line 73
    const-string v35, "PT_BR"

    .line 74
    .line 75
    const-string v36, "RO"

    .line 76
    .line 77
    const-string v37, "RU"

    .line 78
    .line 79
    const-string v38, "SK"

    .line 80
    .line 81
    const-string v39, "SL"

    .line 82
    .line 83
    const-string v40, "SQ"

    .line 84
    .line 85
    const-string v41, "SR"

    .line 86
    .line 87
    const-string v42, "SR_LATN"

    .line 88
    .line 89
    const-string v43, "SV"

    .line 90
    .line 91
    const-string v44, "TH"

    .line 92
    .line 93
    const-string v45, "TL"

    .line 94
    .line 95
    const-string v46, "TR"

    .line 96
    .line 97
    const-string v47, "UK"

    .line 98
    .line 99
    const-string v48, "VI"

    .line 100
    .line 101
    filled-new-array/range {v1 .. v50}, [Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {v0}, Lqd;->o([Ljava/lang/Object;)Ljava/util/Set;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sput-object v0, Lfz;->a:Ljava/util/Set;

    .line 110
    .line 111
    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v0, "_"

    .line 11
    .line 12
    filled-new-array {v0}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x6

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static {p0, v0, v2, v1}, Lkotlin/text/StringsKt;->L(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object v0, Lfz;->a:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v3, 0x0

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    move-object v4, v1

    .line 40
    check-cast v4, Ljava/lang/String;

    .line 41
    .line 42
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Ljava/lang/CharSequence;

    .line 47
    .line 48
    invoke-static {v4, v5, v2}, Lkotlin/text/StringsKt;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object v1, v3

    .line 56
    :goto_0
    check-cast v1, Ljava/lang/String;

    .line 57
    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    sget-object p0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 61
    .line 62
    invoke-virtual {v1, p0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_2
    return-object v3
.end method
