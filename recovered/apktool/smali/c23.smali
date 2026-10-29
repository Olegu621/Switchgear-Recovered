.class public final Lc23;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lh22;

.field public final synthetic b:Le22;

.field public final synthetic c:Lu13;

.field public final synthetic d:Lf22;

.field public final synthetic e:I

.field public final synthetic f:Lh22;

.field public final synthetic i:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lh22;Le22;Lu13;Lf22;ILh22;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc23;->a:Lh22;

    .line 2
    .line 3
    iput-object p2, p0, Lc23;->b:Le22;

    .line 4
    .line 5
    iput-object p3, p0, Lc23;->c:Lu13;

    .line 6
    .line 7
    iput-object p4, p0, Lc23;->d:Lf22;

    .line 8
    .line 9
    iput p5, p0, Lc23;->e:I

    .line 10
    .line 11
    iput-object p6, p0, Lc23;->f:Lh22;

    .line 12
    .line 13
    iput-object p7, p0, Lc23;->i:Ljava/util/ArrayList;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iget-object v0, p0, Lc23;->a:Lh22;

    .line 14
    .line 15
    iget-object v1, v0, Lh22;->a:Ljava/lang/Object;

    .line 16
    .line 17
    sget-object v2, Lek;->Companion:Ldk;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Ldk;->a(Z)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput-object v1, v0, Lh22;->a:Ljava/lang/Object;

    .line 42
    .line 43
    iget-object v0, p0, Lc23;->c:Lu13;

    .line 44
    .line 45
    iget v1, v0, Lu13;->b:I

    .line 46
    .line 47
    const/16 v2, 0x2d

    .line 48
    .line 49
    iget-object v3, p0, Lc23;->d:Lf22;

    .line 50
    .line 51
    if-le v1, v2, :cond_0

    .line 52
    .line 53
    iget v1, v3, Lf22;->a:I

    .line 54
    .line 55
    iget v2, p0, Lc23;->e:I

    .line 56
    .line 57
    if-ge v1, v2, :cond_0

    .line 58
    .line 59
    const/4 v1, 0x1

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const/4 v1, 0x0

    .line 62
    :goto_0
    iget-object v2, p0, Lc23;->b:Le22;

    .line 63
    .line 64
    iput-boolean v1, v2, Le22;->a:Z

    .line 65
    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    add-int/lit8 p1, p2, 0x1

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Lu13;->a(I)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    iget-object v0, p0, Lc23;->f:Lh22;

    .line 77
    .line 78
    iget-object v1, v0, Lh22;->a:Ljava/lang/Object;

    .line 79
    .line 80
    if-nez p1, :cond_1

    .line 81
    .line 82
    check-cast v1, Ljava/util/List;

    .line 83
    .line 84
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    iget p1, v3, Lf22;->a:I

    .line 92
    .line 93
    sget-object p2, Lrj;->Companion:Lqj;

    .line 94
    .line 95
    add-int/lit8 p1, p1, 0x10

    .line 96
    .line 97
    iput p1, v3, Lf22;->a:I

    .line 98
    .line 99
    iget-object p1, v0, Lh22;->a:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, Ljava/util/Collection;

    .line 102
    .line 103
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->M(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iget-object p0, p0, Lc23;->i:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    iget-object p0, v0, Lh22;->a:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p0, Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 117
    .line 118
    .line 119
    new-instance p0, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 122
    .line 123
    .line 124
    iput-object p0, v0, Lh22;->a:Ljava/lang/Object;

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_1
    check-cast v1, Ljava/util/List;

    .line 128
    .line 129
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    if-nez p0, :cond_2

    .line 134
    .line 135
    iget-object p0, v0, Lh22;->a:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast p0, Ljava/util/List;

    .line 138
    .line 139
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    iget p0, v3, Lf22;->a:I

    .line 147
    .line 148
    sget-object p1, Lrj;->Companion:Lqj;

    .line 149
    .line 150
    add-int/lit8 p0, p0, 0x11

    .line 151
    .line 152
    iput p0, v3, Lf22;->a:I

    .line 153
    .line 154
    :cond_2
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 155
    .line 156
    return-object p0
.end method
