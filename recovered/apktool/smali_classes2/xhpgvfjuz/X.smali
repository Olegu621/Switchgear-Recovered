.class public Lxhpgvfjuz/X;
.super Lxhpgvfjuz/ao;
.source "SourceFile"


# direct methods
.method private constructor <init>(Z)V
    .locals 1

    sget-object v0, Lxhpgvfjuz/C;->m:Lxhpgvfjuz/C;

    invoke-direct {p0, v0}, Lxhpgvfjuz/ao;-><init>(Lxhpgvfjuz/C;)V

    iget-object p0, p0, Lxhpgvfjuz/ao;->a:Ljava/util/HashMap;

    const/16 v0, 0x4000

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/16 v0, 0x4000

    invoke-virtual {p0, v0}, Lxhpgvfjuz/ao;->f(I)Z

    move-result p0

    return p0
.end method
