# org.palladiosimulator.elasticity (Elasticity 2.0)

Generic elasticity-policy metamodel — successor design to SPD 1.0.

| Path | Contents |
|------|----------|
| `model/Elasticity.ecore` | Abstract syntax |
| `model/Elasticity.ocl` | Well-formedness sketch |
| `examples/before-spd/` | SPD 1.0 reference instances |
| `examples/after-elasticity/` | Equivalent / extended Elasticity instances (CloudNativeShop, PersonalizedAI) |
| `docs/CloudNativeShop-graph.html` | Interactive shop instance graph (icons + hover rationales) |
| `docs/PersonalizedAI-graph.html` | Interactive PersonaRAG / LLM+RAG instance graph |
| `migration/` | Migrator + validator (Python, stdlib) |
| `docs/` | Redesign, comparison, migration, SimOxide quirks map, further work |

```bash
python3 migration/validate_elasticity.py
python3 migration/migrate_spd_to_elasticity.py examples/before-spd/InfrastructureSPD.xmi /tmp/out.elasticity
```

Start with [docs/REDESIGN.md](docs/REDESIGN.md).  
SPD/Slingshot quirk carry-over: [docs/QUIRKS-ELASTICITY.md](docs/QUIRKS-ELASTICITY.md).  
Large shop example graph: [docs/CloudNativeShop-graph.html](docs/CloudNativeShop-graph.html).  
Personalized AI / RAG / LLM serving graph: [docs/PersonalizedAI-graph.html](docs/PersonalizedAI-graph.html).
