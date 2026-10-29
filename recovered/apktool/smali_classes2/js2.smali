.class public final Ljs2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lv21;


# static fields
.field public static final c:Lhs2;


# instance fields
.field public final a:Ldv;

.field public final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lhs2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lhs2;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ljs2;->c:Lhs2;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ldv;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ljs2;->a:Ldv;

    .line 8
    .line 9
    iput-object p2, p0, Ljs2;->b:Ljava/util/List;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Z)Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Ljs2;->a:Ldv;

    .line 2
    .line 3
    invoke-static {v0}, Lyy1;->s(Lo21;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_8

    .line 12
    .line 13
    const-class p1, [Z

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const-string p1, "kotlin.BooleanArray"

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_0
    const-class p1, [C

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    const-string p1, "kotlin.CharArray"

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const-class p1, [B

    .line 37
    .line 38
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    const-string p1, "kotlin.ByteArray"

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const-class p1, [S

    .line 48
    .line 49
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    const-string p1, "kotlin.ShortArray"

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    const-class p1, [I

    .line 59
    .line 60
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_4

    .line 65
    .line 66
    const-string p1, "kotlin.IntArray"

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    const-class p1, [F

    .line 70
    .line 71
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_5

    .line 76
    .line 77
    const-string p1, "kotlin.FloatArray"

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_5
    const-class p1, [J

    .line 81
    .line 82
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_6

    .line 87
    .line 88
    const-string p1, "kotlin.LongArray"

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_6
    const-class p1, [D

    .line 92
    .line 93
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_7

    .line 98
    .line 99
    const-string p1, "kotlin.DoubleArray"

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_7
    const-string p1, "kotlin.Array"

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_8
    if-eqz p1, :cond_9

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_9

    .line 112
    .line 113
    invoke-static {v0}, Lyy1;->t(Lo21;)Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    goto :goto_0

    .line 122
    :cond_9
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    :goto_0
    iget-object v0, p0, Ljs2;->b:Ljava/util/List;

    .line 127
    .line 128
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    const-string v1, ""

    .line 133
    .line 134
    if-eqz v0, :cond_a

    .line 135
    .line 136
    move-object p0, v1

    .line 137
    goto :goto_1

    .line 138
    :cond_a
    new-instance v6, Lbz;

    .line 139
    .line 140
    invoke-direct {v6, p0}, Lbz;-><init>(Ljs2;)V

    .line 141
    .line 142
    .line 143
    const/16 v7, 0x18

    .line 144
    .line 145
    iget-object v2, p0, Ljs2;->b:Ljava/util/List;

    .line 146
    .line 147
    const-string v3, ", "

    .line 148
    .line 149
    const-string v4, "<"

    .line 150
    .line 151
    const-string v5, ">"

    .line 152
    .line 153
    invoke-static/range {v2 .. v7}, Lkotlin/collections/CollectionsKt;->x(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    :goto_1
    invoke-static {p1, p0, v1}, Len;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Ljs2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljs2;

    .line 6
    .line 7
    iget-object v0, p1, Ljs2;->a:Ldv;

    .line 8
    .line 9
    iget-object v1, p0, Ljs2;->a:Ldv;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ldv;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Ljs2;->b:Ljava/util/List;

    .line 18
    .line 19
    iget-object p1, p1, Ljs2;->b:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Ljs2;->a:Ldv;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldv;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object p0, p0, Ljs2;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, p0}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    add-int/2addr v0, p0

    .line 22
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ljs2;->a(Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    const-string v0, " (Kotlin reflection is not available)"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
