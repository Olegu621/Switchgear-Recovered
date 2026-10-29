.class public Lxhpgvfjuz/ac;
.super Lxhpgvfjuz/ao;
.source "SourceFile"


# direct methods
.method private constructor <init>(ZI)V
    .locals 2

    sget-object v0, Lxhpgvfjuz/C;->t:Lxhpgvfjuz/C;

    invoke-direct {p0, v0}, Lxhpgvfjuz/ao;-><init>(Lxhpgvfjuz/C;)V

    iget-object v0, p0, Lxhpgvfjuz/ao;->a:Ljava/util/HashMap;

    const/16 v1, 0x1601

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p0, Lxhpgvfjuz/ao;->a:Ljava/util/HashMap;

    const/16 p1, 0x1602

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/16 v0, 0x1601

    invoke-virtual {p0, v0}, Lxhpgvfjuz/ao;->f(I)Z

    move-result p0

    return p0
.end method

.method public b()I
    .locals 1

    const/16 v0, 0x1602

    invoke-virtual {p0, v0}, Lxhpgvfjuz/ao;->h(I)I

    move-result p0

    return p0
.end method
