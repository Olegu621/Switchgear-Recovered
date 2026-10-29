.class public final Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$Companion;",
        "",
        "Lkotlinx/serialization/KSerializer;",
        "Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;",
        "serializer",
        "()Lkotlinx/serialization/KSerializer;",
        "usercentrics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$Companion;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Ljava/lang/String;Ljava/util/List;Lkz2;Lmz2;)Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p0, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->d:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v1, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectConsent;

    .line 13
    .line 14
    invoke-direct {v1, p4, p5}, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectConsent;-><init>(Lkz2;Lmz2;)V

    .line 15
    .line 16
    .line 17
    new-instance v3, Ljava/util/ArrayList;

    .line 18
    .line 19
    const/16 p4, 0xa

    .line 20
    .line 21
    invoke-static {p3, p4}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    invoke-direct {v3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result p4

    .line 36
    if-eqz p4, :cond_0

    .line 37
    .line 38
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p4

    .line 42
    check-cast p4, Lm61;

    .line 43
    .line 44
    new-instance v4, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectService;

    .line 45
    .line 46
    iget-object v6, p4, Lm61;->f:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v7, p4, Lm61;->h:Ljava/lang/String;

    .line 49
    .line 50
    iget-object p5, p4, Lm61;->p:Li61;

    .line 51
    .line 52
    iget-boolean v5, p5, Li61;->b:Z

    .line 53
    .line 54
    iget-object v8, p4, Lm61;->m:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v9, p4, Lm61;->s:Ljava/lang/String;

    .line 57
    .line 58
    invoke-direct/range {v4 .. v9}, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectService;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    new-instance v2, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectSettings;

    .line 66
    .line 67
    iget-object p3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->j:Ljava/lang/String;

    .line 68
    .line 69
    iget-object p1, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->c:Ljava/lang/String;

    .line 70
    .line 71
    invoke-direct {v2, p3, p2, p0, p1}, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectSettings;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance p0, Lh50;

    .line 75
    .line 76
    invoke-direct {p0}, Lh50;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lh50;->c()J

    .line 80
    .line 81
    .line 82
    move-result-wide p0

    .line 83
    const-wide/16 p2, 0x3e8

    .line 84
    .line 85
    div-long v4, p0, p2

    .line 86
    .line 87
    new-instance v0, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;

    .line 88
    .line 89
    invoke-direct/range {v0 .. v5}, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;-><init>(Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectConsent;Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectSettings;Ljava/util/ArrayList;J)V

    .line 90
    .line 91
    .line 92
    return-object v0
.end method


# virtual methods
.method public final serializer()Lkotlinx/serialization/KSerializer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/serialization/KSerializer;"
        }
    .end annotation

    .line 1
    sget-object p0, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$$serializer;

    .line 2
    .line 3
    return-object p0
.end method
