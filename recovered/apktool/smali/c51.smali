.class public final Lc51;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public static a(ILjava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne p0, v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    rem-int/2addr p0, v1

    .line 13
    if-nez p0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    div-int/2addr p0, v1

    .line 20
    sget-object v0, Lvy0;->Companion:Luy0;

    .line 21
    .line 22
    new-instance v1, Lkotlin/ranges/IntRange;

    .line 23
    .line 24
    add-int/lit8 v2, p0, -0x1

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x1

    .line 28
    invoke-direct {v1, v3, v2, v4}, Lkotlin/ranges/a;-><init>(III)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lkotlin/ranges/IntRange;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const-string v5, ""

    .line 36
    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    move-object v1, v5

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget v1, v1, Lkotlin/ranges/a;->b:I

    .line 42
    .line 43
    add-int/2addr v1, v4

    .line 44
    invoke-virtual {p1, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v1}, Luy0;->a(ILjava/lang/String;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    const-wide/16 v2, 0x41

    .line 56
    .line 57
    add-long/2addr v0, v2

    .line 58
    new-instance v6, Lkotlin/ranges/IntRange;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    sub-int/2addr v7, v4

    .line 65
    invoke-direct {v6, p0, v7, v4}, Lkotlin/ranges/a;-><init>(III)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6}, Lkotlin/ranges/IntRange;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-eqz v7, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    iget v5, v6, Lkotlin/ranges/a;->b:I

    .line 76
    .line 77
    add-int/2addr v5, v4

    .line 78
    invoke-virtual {p1, p0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    :goto_1
    invoke-static {p0, v5}, Luy0;->a(ILjava/lang/String;)J

    .line 83
    .line 84
    .line 85
    move-result-wide p0

    .line 86
    add-long/2addr p0, v2

    .line 87
    long-to-int v0, v0

    .line 88
    int-to-char v0, v0

    .line 89
    long-to-int p0, p0

    .line 90
    int-to-char p0, p0

    .line 91
    new-instance p1, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0

    .line 107
    :cond_2
    new-instance p0, Lf0;

    .line 108
    .line 109
    const-string p1, "Invalid bit length for language"

    .line 110
    .line 111
    invoke-direct {p0, p1, v1}, Lf0;-><init>(Ljava/lang/String;I)V

    .line 112
    .line 113
    .line 114
    throw p0
.end method

.method public static b(ILjava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    int-to-byte v0, v0

    .line 19
    add-int/lit8 v0, v0, -0x41

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    int-to-byte v2, v2

    .line 27
    add-int/lit8 v2, v2, -0x41

    .line 28
    .line 29
    const/4 v3, 0x3

    .line 30
    if-ltz v0, :cond_1

    .line 31
    .line 32
    const/16 v4, 0x19

    .line 33
    .line 34
    if-gt v0, v4, :cond_1

    .line 35
    .line 36
    if-ltz v2, :cond_1

    .line 37
    .line 38
    if-gt v2, v4, :cond_1

    .line 39
    .line 40
    rem-int/lit8 p1, p0, 0x2

    .line 41
    .line 42
    if-eq p1, v1, :cond_0

    .line 43
    .line 44
    div-int/lit8 p0, p0, 0x2

    .line 45
    .line 46
    sget-object p1, Lvy0;->Companion:Luy0;

    .line 47
    .line 48
    new-instance v1, Luh2;

    .line 49
    .line 50
    invoke-direct {v1, v0}, Luh2;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {v1, p0}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v0, Luh2;

    .line 61
    .line 62
    invoke-direct {v0, v2}, Luh2;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0, p0}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :cond_0
    new-instance p1, Lf0;

    .line 75
    .line 76
    const-string v0, "numBits must be even, "

    .line 77
    .line 78
    const-string v1, " is not valid"

    .line 79
    .line 80
    invoke-static {p0, v0, v1}, Len;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-direct {p1, p0, v3}, Lf0;-><init>(Ljava/lang/String;I)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_1
    new-instance p0, Lf0;

    .line 89
    .line 90
    const-string v0, "Invalid Language Code: "

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-direct {p0, p1, v3}, Lf0;-><init>(Ljava/lang/String;I)V

    .line 97
    .line 98
    .line 99
    throw p0
.end method
